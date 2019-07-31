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
          enumMap.put("是否可开票", "IS_CAN_PAY");
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
          enumMap.put("结算模式", "SETTLE_PATTERN_ENUM_ID");
          enumMap.put("付款方式", "PAYMENT_METHODS_ENUM_ID");
          enumMap.put("发票类型", "INVOICE_TYPE_ENUM_ID");
//        enumMap.put("结算模式", "SETTLEID");
//        enumMap.put("合作方名称", "PARTENER_NAME");
//        enumMap.put("合同编号", "CON_NUM");
//        enumMap.put("付款方式", "PAY_METHODS_ID");
//        enumMap.put("商城结算单号", "EMS_TRANS_NUM");
//        enumMap.put("业务类型", "BUSSINESSNAME");
//        enumMap.put("市场类型", "MALLTYPENAME");
//        enumMap.put("电子合同模板编号", "ELEC_CONTRACT_TEMP_NUM");

        String jsonStr = "{\"PROJECT_INFO_ID\":\"60000062812\",\"PAYMENT_METHODS_ENUM_ID\":\"5000153\",\"UNIT_PRICE\":\"231.62\",\"BILLING_PAY_COMBINE\":\"false\",\"PAYMENT_CONDITION_ENUM_ID\":\"5000282\",\"TAX_AMOUNT\":\"39.38\",\"BILLING_DATE\":\"\",\"INVOICE_BIZ_TYPE_ENUM_ID_code\":\"16\",\"PAYMENT_STAGE_ENUM_ID_value\":\"全额开票\",\"SETTLE_ACC_CODE\":\"J124101-201904-000001\",\"SETTLE_PATTERN_ENUM_ID_code\":\"PROVINCE_SETTLE\",\"SALER_UNIT_ID\":\"1000000363\",\"BILLING_FROM_INFO_ID\":\"2450874\",\"ACCOUNTING_BIZ_TYPE_ENUM_ID_value\":\"应付账款其他\",\"SALER_UNIT_CODE\":\"100001921\",\"CONTRACT_TYPE_code\":\"ORDINARY_CON\",\"CONTRACT_NUM\":\"CU12-4101-2013-001001\",\"CONTRACT_TYPE_value\":\"普通合同\",\"INIT_BILLING_TAX_INCL_AMT\":\"271.00\",\"ORDER_REC_TRA_ID\":\"10000052018\",\"ORDER_CTREATED_DATE\":\"2017-11-16 00:00:00\",\"PAYMENT_STAGE_ENUM_ID_code\":\"FULL_INVOICE\",\"IS_CAN_PAY\":\"true\",\"TAX_INCLUSIVE_AMOUNT\":\"271.00\",\"FROM_SYSTEM_ENUM_ID\":\"5000009\",\"CON_ITEM_ID\":\"0\",\"SETTLE_AMOUNT_ATTR_ENUM_ID_value\":\"正数\",\"BILLING_INFO_ID\":\"0\",\"SALER_UNIT\":\"瑞斯康达科技发展股份有限公司\",\"OPERATION_ORG_CODE\":\"124101\",\"RECEIPT_NUMBER\":\"17389085\",\"ACCOUNTING_BIZ_TYPE_ENUM_ID\":\"5000329\",\"CON_SIGN_TRANSACTION_ORG_NAME\":\"124101_OU_运营公司河南本部\",\"RECEIVED_TIME\":\"2017-11-21 00:00:00\",\"ORDER_QUANTITY\":\"1.00\",\"CHARGE_TYPE_ENUM_ID_value\":\"工程项目费用\",\"BILLING_STANDARD_ENUM_ID_code\":\"NET_PRICE\",\"VENDOR_SITE_CODE\":\"YX-内部商城\",\"BILLING_CODE\":\"\",\"INVOICE_TYPE_ENUM_ID_code\":\"VAT_SPECIAL_INVOICE\",\"PAYMENT_ORG_CODE\":\"124101\",\"SETTLE_TRANSACTION_ORG_CODE\":\"124101\",\"PAYMENT_ORG_ID\":\"701\",\"RECEIVED_ORG_CODE\":\"124103\",\"SETTLE_CONFRIM_TIME\":\"2019-04-04 16:59:49\",\"SETTLE_TRANSACTION_ORG_ID\":\"701\",\"PROJECT_NUMBER\":\"9EI17AC0B00420\",\"CONTRACT_NAME\":\"2012－2013年度中国联通MSAP设备集中采购合同\",\"SETTLE_AMOUNT_ATTR_ENUM_ID\":\"5000084\",\"FROM_SYSTEM_ENUM_ID_value\":\"内部商城\",\"PAYMENT_METHODS_ENUM_ID_value\":\"电子付款\",\"ORDER_HEADER_ID\":\"10000037160\",\"ELEC_CONTRACY_NUM\":\"\",\"CONTRACT_INFO_ID\":\"40000001039\",\"BILLING_TAX_INCLUSIVE_AMT\":\"271.00\",\"FROM_SYSTEM_ENUM_ID_code\":\"EMS\",\"BILLING_NET_AMOUNT\":\"231.62\",\"SHARDING_ID\":\"1241\",\"RECEIVED_ORG_NAME\":\"124103_OU_运营公司河南开封\",\"PURCHASE_UNIT_ORG_ID\":\"701\",\"CU_S_S_ACCOUNT_ID\":\"xuxc10\",\"ORDER_LINE_ID\":\"10000048829\",\"INVOICE_TYPE_ENUM_ID_value\":\"增值税专票\",\"ACCOUNTING_BIZ_TYPE_ENUM_ID_code\":\"1090\",\"PAYMENT_CONDITION_ENUM_ID_value\":\"先验票后付款\",\"ITEM_DESCRIPTION\":\"/SFP_USFP-03/SS15-D-R\",\"BILLING_TAX_AMOUNT\":\"39.38\",\"INVOICE_BIZ_TYPE_ENUM_ID\":\"5000596\",\"ORDER_ORG_CODE\":\"124103\",\"BILLING_STANDARD_ENUM_ID_value\":\"净价\",\"INVOICE_TYPE_ENUM_ID\":\"5000130\",\"SETTLE_TAX_RATE\":\"1\",\"PAY_FOR_ANOTHER_ORG_NAME\":\"\",\"PAYMENT_STAGE_ENUM_ID\":\"5000378\",\"MALL_TYPE\":\"5001071\",\"INVOICE_BIZ_TYPE_ENUM_ID_value\":\"省分一点结算\",\"CONTRACT_TYPE\":\"5001062\",\"CHARGE_TYPE_ENUM_ID_code\":\"CAPEX\",\"PO_NUMBER\":\"PO-HNGCWZD-20171114151524218_CU12-4101-2013-001001\",\"ACTUAL_TAX_AMOUNT\":\"39.38\",\"PAYMENT_AMOUNT\":\"0.00\",\"ORDER_LINE_NUMBER\":\"17389085\",\"RECEIVED_QUANTITY\":\"1.00\",\"CU_S_S_ACCOUNT_NAME\":\"徐修成\",\"BILLING_RULE_CODE\":\"1\",\"BILLING_STANDARD_ENUM_ID\":\"5000193\",\"PURCHASE_UNIT_ORG_NAME\":\"中国联合网络通信有限公司河南省分公司\",\"PLAN_PAY_DATE\":\"2017-11-21 00:00:00\",\"CHARGE_TYPE_ENUM_ID\":\"5000740\",\"PROJECT_NAME\":\"2017年中国联通开封市尉氏县锦程酒店等（智慧酒店）大客户接入新建工程\",\"VENDOR_SITE_ID\":\"1331168\",\"MALL_TYPE_code\":\"PROFESSION_MARKET\",\"PURCHASE_UNIT_ORG_CODE\":\"124101\",\"BILLING_RULE_CODE_cName\":\"按到货全额开票\",\"SETTLE_ACC_TOTAL_AMT\":\"2260.00\",\"SETTLE_PATTERN_ENUM_ID_value\":\"省分一点结算\",\"SETTLE_AMOUNT_ATTR_ENUM_ID_code\":\"POSITIVE\",\"MALL_TYPE_value\":\"专业市场\",\"SETTLE_PATTERN_ENUM_ID\":\"5000087\",\"PAYMENT_CONDITION_ENUM_ID_code\":\"F_CHECK_S_PAY\",\"PAYMENT_PHASE_SEQ\":\"1\",\"IS_PAY_FOR_ANOTHER\":\"false\",\"TAX_EXCLUDED_AMOUNT\":\"231.62\",\"BILLING_DETAIL_ID\":\"1425129\",\"UNIT_OF_MEASURE\":\"块\",\"SECOND_ORG_NAME\":\"河南省分公司市场营销部\",\"SETTLE_ACC_HEAD_ID\":\"30000247078\",\"PAYMENT_METHODS_ENUM_ID_code\":\"EFT\",\"PAYMENT_PERCENT\":\"100.00\",\"TAX_RATE\":\"17.00\",\"ORDER_ORG_NAME\":\"124103_OU_运营公司河南开封\",\"BILLING_QUANTITY\":\"1.00\",\"PAYMENT_ORG_NAME\":\"124101_OU_运营公司河南本部\"},{\"PROJECT_INFO_ID\":\"60000062812\",\"PAYMENT_METHODS_ENUM_ID\":\"5000153\",\"UNIT_PRICE\":\"231.62\",\"BILLING_PAY_COMBINE\":\"false\",\"PAYMENT_CONDITION_ENUM_ID\":\"5000282\",\"TAX_AMOUNT\":\"39.38\",\"BILLING_DATE\":\"\",\"INVOICE_BIZ_TYPE_ENUM_ID_code\":\"16\",\"PAYMENT_STAGE_ENUM_ID_value\":\"全额开票\",\"SETTLE_ACC_CODE\":\"J124101-201904-000001\",\"SETTLE_PATTERN_ENUM_ID_code\":\"PROVINCE_SETTLE\",\"SALER_UNIT_ID\":\"1000000363\",\"BILLING_FROM_INFO_ID\":\"2450873\",\"ACCOUNTING_BIZ_TYPE_ENUM_ID_value\":\"应付账款其他\",\"SALER_UNIT_CODE\":\"100001921\",\"CONTRACT_TYPE_code\":\"ORDINARY_CON\",\"CONTRACT_NUM\":\"CU12-4101-2013-001001\",\"CONTRACT_TYPE_value\":\"普通合同\",\"INIT_BILLING_TAX_INCL_AMT\":\"271.00\",\"ORDER_REC_TRA_ID\":\"10000052017\",\"ORDER_CTREATED_DATE\":\"2017-11-16 00:00:00\",\"PAYMENT_STAGE_ENUM_ID_code\":\"FULL_INVOICE\",\"IS_CAN_PAY\":\"true\",\"TAX_INCLUSIVE_AMOUNT\":\"271.00\",\"FROM_SYSTEM_ENUM_ID\":\"5000009\",\"CON_ITEM_ID\":\"0\",\"SETTLE_AMOUNT_ATTR_ENUM_ID_value\":\"正数\",\"BILLING_INFO_ID\":\"0\",\"SALER_UNIT\":\"瑞斯康达科技发展股份有限公司\",\"OPERATION_ORG_CODE\":\"124101\",\"RECEIPT_NUMBER\":\"17389083\",\"ACCOUNTING_BIZ_TYPE_ENUM_ID\":\"5000329\",\"CON_SIGN_TRANSACTION_ORG_NAME\":\"124101_OU_运营公司河南本部\",\"RECEIVED_TIME\":\"2017-11-21 00:00:00\",\"ORDER_QUANTITY\":\"1.00\",\"CHARGE_TYPE_ENUM_ID_value\":\"工程项目费用\",\"BILLING_STANDARD_ENUM_ID_code\":\"NET_PRICE\",\"VENDOR_SITE_CODE\":\"YX-内部商城\",\"BILLING_CODE\":\"\",\"INVOICE_TYPE_ENUM_ID_code\":\"VAT_SPECIAL_INVOICE\",\"PAYMENT_ORG_CODE\":\"124101\",\"SETTLE_TRANSACTION_ORG_CODE\":\"124101\",\"PAYMENT_ORG_ID\":\"701\",\"RECEIVED_ORG_CODE\":\"124103\",\"SETTLE_CONFRIM_TIME\":\"2019-04-04 16:59:49\",\"SETTLE_TRANSACTION_ORG_ID\":\"701\",\"PROJECT_NUMBER\":\"9EI17AC0B00420\",\"CONTRACT_NAME\":\"2012－2013年度中国联通MSAP设备集中采购合同\",\"SETTLE_AMOUNT_ATTR_ENUM_ID\":\"5000084\",\"FROM_SYSTEM_ENUM_ID_value\":\"内部商城\",\"PAYMENT_METHODS_ENUM_ID_value\":\"电子付款\",\"ORDER_HEADER_ID\":\"10000037160\",\"ELEC_CONTRACY_NUM\":\"\",\"CONTRACT_INFO_ID\":\"40000001039\",\"BILLING_TAX_INCLUSIVE_AMT\":\"271.00\",\"FROM_SYSTEM_ENUM_ID_code\":\"EMS\",\"BILLING_NET_AMOUNT\":\"231.62\",\"SHARDING_ID\":\"1241\",\"RECEIVED_ORG_NAME\":\"124103_OU_运营公司河南开封\",\"PURCHASE_UNIT_ORG_ID\":\"701\",\"CU_S_S_ACCOUNT_ID\":\"xuxc10\",\"ORDER_LINE_ID\":\"10000048828\",\"INVOICE_TYPE_ENUM_ID_value\":\"增值税专票\",\"ACCOUNTING_BIZ_TYPE_ENUM_ID_code\":\"1090\",\"PAYMENT_CONDITION_ENUM_ID_value\":\"先验票后付款\",\"ITEM_DESCRIPTION\":\"/SFP_USFP-03/SS13-D-R\",\"BILLING_TAX_AMOUNT\":\"39.38\",\"INVOICE_BIZ_TYPE_ENUM_ID\":\"5000596\",\"ORDER_ORG_CODE\":\"124103\",\"BILLING_STANDARD_ENUM_ID_value\":\"净价\",\"INVOICE_TYPE_ENUM_ID\":\"5000130\",\"SETTLE_TAX_RATE\":\"1\",\"PAY_FOR_ANOTHER_ORG_NAME\":\"\",\"PAYMENT_STAGE_ENUM_ID\":\"5000378\",\"MALL_TYPE\":\"5001071\",\"INVOICE_BIZ_TYPE_ENUM_ID_value\":\"省分一点结算\",\"CONTRACT_TYPE\":\"5001062\",\"CHARGE_TYPE_ENUM_ID_code\":\"CAPEX\",\"PO_NUMBER\":\"PO-HNGCWZD-20171114151524218_CU12-4101-2013-001001\",\"ACTUAL_TAX_AMOUNT\":\"39.38\",\"PAYMENT_AMOUNT\":\"0.00\",\"ORDER_LINE_NUMBER\":\"17389083\",\"RECEIVED_QUANTITY\":\"1.00\",\"CU_S_S_ACCOUNT_NAME\":\"徐修成\",\"BILLING_RULE_CODE\":\"1\",\"BILLING_STANDARD_ENUM_ID\":\"5000193\",\"PURCHASE_UNIT_ORG_NAME\":\"中国联合网络通信有限公司河南省分公司\",\"PLAN_PAY_DATE\":\"2017-11-21 00:00:00\",\"CHARGE_TYPE_ENUM_ID\":\"5000740\",\"PROJECT_NAME\":\"2017年中国联通开封市尉氏县锦程酒店等（智慧酒店）大客户接入新建工程\",\"VENDOR_SITE_ID\":\"1331168\",\"MALL_TYPE_code\":\"PROFESSION_MARKET\",\"PURCHASE_UNIT_ORG_CODE\":\"124101\",\"BILLING_RULE_CODE_cName\":\"按到货全额开票\",\"SETTLE_ACC_TOTAL_AMT\":\"2260.00\",\"SETTLE_PATTERN_ENUM_ID_value\":\"省分一点结算\",\"SETTLE_AMOUNT_ATTR_ENUM_ID_code\":\"POSITIVE\",\"MALL_TYPE_value\":\"专业市场\",\"SETTLE_PATTERN_ENUM_ID\":\"5000087\",\"PAYMENT_CONDITION_ENUM_ID_code\":\"F_CHECK_S_PAY\",\"PAYMENT_PHASE_SEQ\":\"1\",\"IS_PAY_FOR_ANOTHER\":\"false\",\"TAX_EXCLUDED_AMOUNT\":\"231.62\",\"BILLING_DETAIL_ID\":\"1425128\",\"UNIT_OF_MEASURE\":\"块\",\"SECOND_ORG_NAME\":\"河南省分公司市场营销部\",\"SETTLE_ACC_HEAD_ID\":\"30000247078\",\"PAYMENT_METHODS_ENUM_ID_code\":\"EFT\",\"PAYMENT_PERCENT\":\"100.00\",\"TAX_RATE\":\"17.00\",\"ORDER_ORG_NAME\":\"124103_OU_运营公司河南开封\",\"BILLING_QUANTITY\":\"1.00\",\"PAYMENT_ORG_NAME\":\"124101_OU_运营公司河南本部\"}\n";

        HashMap exMap = new HashMap();
//        exMap.put("HANDLED_PERSON_NAME", "heyingying");
//        exMap.put("SHARDING_ID", "1333");
        exMap.put("SETTLE_PATTERN_ENUM_ID", "");
        exMap.put("PAYMENT_METHODS_ENUM_ID", "");
        exMap.put("INVOICE_TYPE_ENUM_ID", "");
        String newJsonStr = excelUtils.exchangeEnum(jsonStr, exMap);

        ArrayList<String> list = new ArrayList<>();
        list.add("IS_CAN_PAY");
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
