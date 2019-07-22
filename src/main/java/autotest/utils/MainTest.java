package autotest.utils;


import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.HashMap;

public class MainTest {

    public static void main(String[] args) throws Exception {
        HashMap enumMap = new HashMap();
        ExcelUtils excelUtils = new ExcelUtils();
        HashMap hashMap = excelUtils.getRowValue("D:\\apache-jmeter-5.1.1\\bin\\exportfile.xls", 0, 1);
        System.out.println(hashMap.toString());
        enumMap.put("合作方名称", "partnerName");
        enumMap.put("合同编号", "contractNum");
        enumMap.put("合同名称", "contractName");
        enumMap.put("结算单编号", "settleAccCode");
        enumMap.put("结算组织", "settleTransactionOrgName");
        enumMap.put("结算单价税合计", "priceTaxTotalAmt");
        enumMap.put("业务类型", "businessType");
        enumMap.put("创建日期", "creationDate");
        enumMap.put("联通方结算专员", "cuSSAccountName");
        enumMap.put("合作方结算专员", "partnerSSAccountName");
        enumMap.put("状态", "sacHeadStatusEnumId");
//        enumMap.put("付款组织", "PAY_ORG_NAME");
//        enumMap.put("付款类型", "PAYTYPENAME");
//        enumMap.put("付款单号", "PAY_INFO_CODE");
//        enumMap.put("结算专员", "HANDLED_PERSON_NAME");
//        enumMap.put("单据类型", "IS_COMBINE");
//        enumMap.put("付款日期", "PAY_DATE");
//        enumMap.put("付款金额", "PAY_AMOUNT");
//        enumMap.put("付款状态", "PAY_STATUS_ID");
//        enumMap.put("当前处理环节", "ACTIVITY_DEF_NAME");
//        enumMap.put("当前处理人", "PROCESSING_ACCOUNT_NAME");
//        enumMap.put("结算模式", "SETTLEID");
//        enumMap.put("合作方名称", "PARTENER_NAME");
//        enumMap.put("合同编号", "CON_NUM");
//        enumMap.put("付款方式", "PAY_METHODS_ID");
//        enumMap.put("商城结算单号", "EMS_TRANS_NUM");
//        enumMap.put("业务类型", "BUSSINESSNAME");
//        enumMap.put("市场类型", "MALLTYPENAME");
//        enumMap.put("电子合同模板编号", "ELEC_CONTRACT_TEMP_NUM");

        String jsonStr = "{\"settleAccCode\":\"J124101-201904-000001\",\"partnerName\":\"瑞斯康达科技发展股份有限公司\",\"priceTaxTotalAmt\":\"2260.00\",\"settleAccHeadId\":\"30000247078\",\"creationDate\":\"2019-04-04 16:37:06\",\"easSettlementCode\":\"\",\"settleTransactionOrgName\":\"124101_OU_运营公司河南本部\",\"cuSSAccountName\":\"徐修成\",\"accountingStatusEnumId\":\"5000410\",\"partnerSSAccountName\":\"李浩鹏\",\"contractNum\":\"CU12-4101-2013-001001\",\"contractName\":\"2012－2013年度中国联通MSAP设备集中采购合同\",\"sacHeadStatusEnumId\":\"5000099\",\"shardingId\":\"1241\",\"businessType\":\"\"}";

        HashMap exMap = new HashMap();
//        exMap.put("HANDLED_PERSON_NAME", "heyingying");
//        exMap.put("SHARDING_ID", "1333");
        String newJsonStr = excelUtils.exchangeEnum(jsonStr, exMap);

        ArrayList<String> list = new ArrayList<>();
//        list.add("PAY_AMOUNT");
        String finalStr = excelUtils.updateJsonStr(jsonStr,list,1);
//

        String result = excelUtils.checkCellValue(jsonStr, enumMap, hashMap);
        System.out.println(result);
//        String str = EnumMapUtils.hashMap.get("5000326").toString();
//        System.out.println(str);

    }
}
