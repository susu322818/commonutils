package autotest.utils;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.json.JSONObject;

import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Excel Utils
 *
 * @auther abhe
 * @date 2019/06/25
 */
public class ExcelUtils {
    private Logger log = Logger.getLogger(ExcelUtils.class);

    /**
     * Get Excel row value by row num
     *
     * @param path
     * @param vRow
     * @return
     * @throws Exception
     */
    public HashMap<String, String> getRowValue(String path, int tRow, int vRow) throws Exception {
        HashMap rowMap = new HashMap();
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(new FileInputStream(path));
        HSSFSheet sheet = hssfWorkbook.getSheetAt(0);
        HSSFRow titleRow = sheet.getRow(tRow);
        HSSFRow valueRow = sheet.getRow(vRow);
        for (int i = 0; i < titleRow.getPhysicalNumberOfCells(); i++) {
            String titleCell = titleRow.getCell(i).getStringCellValue();
            if (valueRow.getCell(i) != null) {
                valueRow.getCell(i).setCellType(CellType.STRING);
            }
            String valueCell = valueRow.getCell(i).getStringCellValue();
            rowMap.put(titleCell, valueCell);
        }
        return rowMap;
    }

    /**
     * Check value between excel and page
     *
     * @param record
     * @param enumMap
     * @param rowMap
     * @return
     */
    public String checkCellValue(String record, HashMap<String, String> enumMap, HashMap<String, String> rowMap) {
        StringBuffer resultStr = new StringBuffer("Check Result:\n");
        try {
            JSONObject recordObj = new JSONObject(record);
            Iterator iter = enumMap.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                Object enumKey = entry.getKey();
                if (rowMap.containsKey(enumKey)) {
                    Object enumVal = entry.getValue();
                    String recordVal = recordObj.get(String.valueOf(enumVal)).toString();
                    if (!rowMap.get(enumKey).equals(recordVal)) {
                        resultStr.append("Failed: [" + enumKey + "] - Excel: " + rowMap.get(enumKey) + ", Page: " + recordVal + "\n");
                    } else {
                        resultStr.append("Success: [" + enumKey + "] - Excel: " + rowMap.get(enumKey) + ", Page: " + recordVal + "\n");
                    }
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
        return resultStr.toString();
    }

    /**
     * Change enum to real value
     *
     * @param record
     * @param exMap
     * @return
     */
    public String exchangeEnum(String record, HashMap<String, String> exMap) {
        JSONObject recordObj = new JSONObject(record);
        Iterator iter = exMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object enumKey = entry.getKey();
            recordObj.put(String.valueOf(enumKey), exMap.get(enumKey));
        }

        return recordObj.toString();
    }

    /**
     * Change value for record
     * type: 1=Millimeter;
     *
     * @param record
     * @param strList
     * @param type
     * @return
     */
    public String updateJsonStr(String record, List<String> strList, int type) {
        JSONObject recordObj = new JSONObject(record);
        switch (type) {
            case 1:
                DecimalFormat df = new DecimalFormat(",###,##0.00");
                for (String str : strList) {
                    BigDecimal bd = new BigDecimal(recordObj.get(str).toString());
                    String newStr = df.format(bd);
                    recordObj.put(str, newStr);
                }
                break;
        }
        return recordObj.toString();
    }

}
