package autotest.utils;

import java.util.HashMap;

/**
 * Enum static map utils
 *
 * @auther abhe
 * @date 2019/06/26
 */
public class EnumMapUtils {

    public final static HashMap hashMap = new HashMap();
    static {
        // 结算模式
        hashMap.put("5000086", "集团一点结算");
        hashMap.put("5000087", "省分一点结算");
        hashMap.put("5000088", "集团代付");
        hashMap.put("5000089", "地市合同省代付");
        hashMap.put("5000090", "集团合同省分支付");
        hashMap.put("5000040", "集团总部结算");

        // 业务类型
        hashMap.put("5002001", "工装采购");
        hashMap.put("5002002", "铁塔租赁费");
        hashMap.put("5002003", "安全生产费");

        // 市场类型
        hashMap.put("5001071", "专业市场");
        hashMap.put("5001072", "公开市场");
        hashMap.put("5001073", "电子超市");
        hashMap.put("5001074", "B域支付");

        // 付款状态
        hashMap.put("5000139", "草稿");
        hashMap.put("5000140", "已确认");
        hashMap.put("5000141", "审批中");
        hashMap.put("5000142", "审批驳回");
        hashMap.put("5000143", "已审批");
        hashMap.put("5000144", "已撤销");
        hashMap.put("5000568", "重新审批");
        hashMap.put("5000400", "已退款");

        // 付款类型
        hashMap.put("5000136", "预付款");
        hashMap.put("5000137", "付款");
        hashMap.put("5000138", "退款");
        hashMap.put("5000145", "总账支付");

        // 付款方式
        hashMap.put("5000151", "现金");
        hashMap.put("5000152", "支票");
        hashMap.put("5000153", "电子付款");
        hashMap.put("5000154", "电汇");
        hashMap.put("5000155", "应付票据");
        hashMap.put("5000156", "银行扣款");
        hashMap.put("5000160", "轧差处理");

        // 付款币种
        hashMap.put("5000067", "人民币");
        hashMap.put("5000068", "美元");
        hashMap.put("5000069", "英镑");
        hashMap.put("5000070", "欧元");
        hashMap.put("5000071", "日元");
        hashMap.put("5000072", "港币");
        hashMap.put("5000592", "新币");
        hashMap.put("5000593", "缅元");
        hashMap.put("5000594", "澳大利亚元");

        // 核算业务类型
        hashMap.put("5000304", "工程类设备及物料款");
        hashMap.put("5000305", "非工程类设备及物料款");
        hashMap.put("5000306", "工程劳务款");
        hashMap.put("5000307", "业务外包结算款");
        hashMap.put("5000308", "ICT款");
        hashMap.put("5000309", "修理及运行维护费");
        hashMap.put("5000310", "通信终端款");
        hashMap.put("5000311", "卡设计及制作费");
        hashMap.put("5000312", "电路及网络租赁费");
        hashMap.put("5000313", "房屋建筑物租赁费");
        hashMap.put("5000314", "其他租赁费");
        hashMap.put("5000315", "广告宣传费");
        hashMap.put("5000316", "水电取暖费");
        hashMap.put("5000317", "物业管理费");
        hashMap.put("5000318", "中介机构服务费");
        hashMap.put("5000319", "广告传媒业务款");
        hashMap.put("5000320", "频率占用费");
        hashMap.put("5000321", "码号资源费");
        hashMap.put("5000322", "技术服务费");
        hashMap.put("5000323", "社会渠道费用");
        hashMap.put("5000324", "网间结算款");
        hashMap.put("5000325", "合作业务分成款");
        hashMap.put("5000326", "合作业务分成款（集中PRM）");
        hashMap.put("5000327", "合作业务分成款（其他系统）");
        hashMap.put("5000328", "支付业务服务费");
        hashMap.put("5000329", "应付账款其他");
        hashMap.put("5000510", "其他应付款其他");
        hashMap.put("5000511", "电子券");
        hashMap.put("5000512", "其他用户权益赠送");
        hashMap.put("5000551", "招投标保证金");
        hashMap.put("5000582", "其他保证金");
        hashMap.put("5001091", "多核算业务类型");
        hashMap.put("5001092", "总账支付");

        // 付款阶段
        hashMap.put("5000330", "预付款");
        hashMap.put("5000331", "到货款");
        hashMap.put("5000332", "上线款");
        hashMap.put("5000333", "终验款");
        hashMap.put("5000334", "决算款");
        hashMap.put("5000335", "尾款");
        hashMap.put("5000336", "结算款");
        hashMap.put("5000337", "验收款");
        hashMap.put("5000338", "进度款1");
        hashMap.put("5000339", "进度款2");
        hashMap.put("5000340", "进度款3");
        hashMap.put("5000341", "代付审计费");
        hashMap.put("5000342", "质量保证金");
        hashMap.put("5000343", "其他");
        hashMap.put("5000344", "初验款");
        hashMap.put("5000346", "按季度支付");
        hashMap.put("5000348", "保险费");
        hashMap.put("5000350", "代理费");
        hashMap.put("5000351", "保修款");
        hashMap.put("5000352", "进度款4");
        hashMap.put("5000354", "一次性付款");
        hashMap.put("5000356", "进度款");
        hashMap.put("5000357", "保证金");
        hashMap.put("5000358", "保质金");
        hashMap.put("5000359", "初始化未支付");
        hashMap.put("5000366", "初验");
        hashMap.put("5000367", "到货");
        hashMap.put("5000368", "交货付款");
        hashMap.put("5000369", "老数据(详情见备注)");
        hashMap.put("5000370", "历史数据");
        hashMap.put("5000371", "其它");
        hashMap.put("5000372", "上线费");
        hashMap.put("5000373", "上线付款");
        hashMap.put("5000374", "一次性");
        hashMap.put("5000375", "一次性验收款");
        hashMap.put("5000376", "预付款（有发票）");
        hashMap.put("5000377", "终验");
        hashMap.put("5000378", "全额开票");
        hashMap.put("5000379", "支付审计费");
        hashMap.put("5000380", "廉洁保证金");
        hashMap.put("5000381", "到付款");
        hashMap.put("5000382", "质保金");

        // 发票核算状态
        hashMap.put("5000157", "未核算");
        hashMap.put("5000158", "核算中");
        hashMap.put("5000159", "已核算");
        hashMap.put("5000164", "已入账");
        hashMap.put("5000410", "无需核算");
        hashMap.put("5000411", "部分核算");
        hashMap.put("5000412", "传送成功");

        // 付款清单状态
        hashMap.put("5000286", "未支付");
        hashMap.put("5000287", "传送成功");
        hashMap.put("5000288", "资金驳回");
        hashMap.put("5000289", "支付成功");
        hashMap.put("5000290", "支付失败");
        hashMap.put("5000291", "已撤销");
        hashMap.put("5000292", "已退款");
        hashMap.put("5000420", "导入成功");
        hashMap.put("5000421", "传送中");
        hashMap.put("5000422", "传送失败");
        hashMap.put("5000423", "无需支付");
        hashMap.put("5000566", "重新支付成功");
        hashMap.put("5000567", "已退票");

        // 费用类型
        hashMap.put("5000740", "工程项目费用");
        hashMap.put("5000742", "运营成本费用");
        hashMap.put("5000744", "不区分");

        // 凭证类别
        hashMap.put("5000166", "暂估上划");
        hashMap.put("5000168", "付款确认");
        hashMap.put("5000169", "预付款支付");
        hashMap.put("5000170", "退款确认");
        hashMap.put("5000171", "暂估划转");
        hashMap.put("5000401", "应付发票");
        hashMap.put("5000402", "预付款核销");
        hashMap.put("5000404", "预付款发票");
        hashMap.put("5000405", "虚拟发票");
        hashMap.put("5000406", "发票价差");
        hashMap.put("5000407", "B域实付");
        hashMap.put("5000408", "应付上划");
        hashMap.put("5000409", "税金上划");

        // 接口数据名称
        hashMap.put("5000950", "总账凭证接口数据");
        hashMap.put("5000951", "应付发票凭证接口数据");
        hashMap.put("5000952", "虚拟发票凭证接口数据");
        hashMap.put("5000953", "应付付款凭证接口数据");
        hashMap.put("5000954", "撤销凭证接口数据");

        // 导入标识
        hashMap.put("5000754", "待导入");
        hashMap.put("5000755", "传送中");
        hashMap.put("5000756", "会计区间验证失败");
        hashMap.put("5000757", "传送成功");
        hashMap.put("5000758", "传送失败");
        hashMap.put("5000759", "验证成功");
        hashMap.put("5000760", "验证失败");
        hashMap.put("5000761", "无需导入");
        hashMap.put("5000762", "等待验证");

        // 数据来源
        hashMap.put("5000004", "主数据");
        hashMap.put("5000005", "核心ERP系统");
        hashMap.put("5000006", "合作方系统");
        hashMap.put("5000007", "合同系统");
        hashMap.put("5000008", "PMS管理系统");
        hashMap.put("5000009", "内部商城");
        hashMap.put("5000010", "营销系统");
        hashMap.put("5000011", "税务系统");
        hashMap.put("5000012", "结算平台");
        hashMap.put("5000569", "内部商城结算单");
        hashMap.put("5001041", "公开市场");
        hashMap.put("5001042", "电子超市");
        hashMap.put("5001044", "B域接入");

        // 开票状态
        hashMap.put("5000107", "草稿");
        hashMap.put("5000108", "合作方提交");
        hashMap.put("5000109", "提交开票");
        hashMap.put("5000110", "校验错误");
        hashMap.put("5000111", "校验通过");
        hashMap.put("5000112", "可审核");
        hashMap.put("5000113", "联通驳回");
        hashMap.put("5000116", "审核中");
        hashMap.put("5000117", "已审核");
        hashMap.put("5000118", "审核未通过");
        hashMap.put("5000119", "已作废");
        hashMap.put("5000574", "作废审核中");
        hashMap.put("5000575", "可作废");
        hashMap.put("5000576", "提交红冲");
        hashMap.put("5000583", "红票已认证");

        // 发票类型
        hashMap.put("5000130", "增值税专票");
        hashMap.put("5000131", "增值税普票");
        hashMap.put("5000132", "非增值税发票");
        hashMap.put("5000284", "增值税专用发票");
        hashMap.put("5000285", "红字发票");

        // 发票状态
        hashMap.put("5000126", "正常发票");
        hashMap.put("5000127", "提交换票");
        hashMap.put("5000128", "提交红冲");
        hashMap.put("5000147", "已换票");
        hashMap.put("5000148", "已红冲");
    }
}
