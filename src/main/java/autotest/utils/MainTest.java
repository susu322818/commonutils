package autotest.utils;


import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.util.ArrayList;
import java.util.HashMap;

public class MainTest {

    public static void main(String[] args) throws Exception {
        HashMap enumMap = new HashMap();
        ExcelUtils excelUtils = new ExcelUtils();
        HashMap hashMap = excelUtils.getRowValue("D:\\apache-jmeter-5.1.1\\bin\\exportfile.xls", 2, 3);
        System.out.println(hashMap.toString());
//        enumMap.put("合作方名称", "partnerName");
//        enumMap.put("合同编号", "contractNum");
//        enumMap.put("合同名称", "contractName");
//        enumMap.put("结算单编号", "settleAccCode");
//        enumMap.put("结算组织", "settleTransactionOrgName");
//        enumMap.put("结算单价税合计", "priceTaxTotalAmt");
//        enumMap.put("业务类型", "businessType");
//        enumMap.put("创建日期", "creationDate");
//        enumMap.put("联通方结算专员", "cuSSAccountName");
//        enumMap.put("合作方结算专员", "partnerSSAccountName");
//        enumMap.put("状态", "sacHeadStatusEnumId");
//          enumMap.put("是否可开票", "IS_CAN_PAY");
          enumMap.put("核算业务类型", "ACCOUNTING_BIZ_TYPE_ENUM_ID");
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
//          enumMap.put("结算模式", "SETTLE_PATTERN_ENUM_ID");
//          enumMap.put("付款方式", "PAYMENT_METHODS_ENUM_ID");
//          enumMap.put("发票类型", "INVOICE_TYPE_ENUM_ID");
//        enumMap.put("结算模式", "SETTLEID");
//        enumMap.put("合作方名称", "PARTENER_NAME");
//        enumMap.put("合同编号", "CON_NUM");
//        enumMap.put("付款方式", "PAY_METHODS_ID");
//        enumMap.put("商城结算单号", "EMS_TRANS_NUM");
//        enumMap.put("业务类型", "BUSSINESSNAME");
//        enumMap.put("市场类型", "MALLTYPENAME");
//        enumMap.put("电子合同模板编号", "ELEC_CONTRACT_TEMP_NUM");

        String jsonStr = "{\"ACCOUNTING_BIZ_TYPE_ENUM_ID\":5000304}\n";

        HashMap exMap = new HashMap();
//        exMap.put("HANDLED_PERSON_NAME", "heyingying");
//        exMap.put("SHARDING_ID", "1333");
//        exMap.put("SETTLE_PATTERN_ENUM_ID", "地市合同省代付");
        exMap.put("ACCOUNTING_BIZ_TYPE_ENUM_ID", "");
//        exMap.put("PAYMENT_METHODS_ENUM_ID", "");
//        exMap.put("INVOICE_TYPE_ENUM_ID", "");
        String newJsonStr = excelUtils.exchangeEnum(jsonStr, exMap);

        ArrayList<String> list = new ArrayList<>();
//        list.add("IS_CAN_PAY");
//        list.add("PAY_AMOUNT");
//        list.add("SETTLE_PATTERN_ENUM_ID");
        String finalStr = excelUtils.updateJsonStr(newJsonStr,list,3);
//

        String result = excelUtils.checkCellValue(finalStr, enumMap, hashMap);
        System.out.println(result);
//        String str = EnumMapUtils.hashMap.get("5000087").toString();
//        System.out.println(str);

    }
}
