package com.test.springboottest.myTest.Json;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @program: springbootTest
 * @description: JSONTest
 * @author: hygge
 * @create: 2023/07/18
 */
public class JSONTest {
  @Test
  void testJson() {
    String jsonStr = "{\"touser\":\"UserID1|UserID2|UserID3\",\"toparty\":\"PartyID1 | PartyID2\",\"totag\":\"TagID1 | TagID2\",\"msgtype\":\"template_card\",\"agentid\":1,\"template_card\":{\"card_type\":\"button_interaction\",\"source\":{\"icon_url\":\"图片的url\",\"desc\":\"企业微信\",\"desc_color\":1},\"action_menu\":{\"desc\":\"卡片副交互辅助文本说明\",\"action_list\":[{\"text\":\"接受推送\",\"key\":\"A\"},{\"text\":\"不再推送\",\"key\":\"B\"}]},\"main_title\":{\"title\":\"欢迎使用企业微信\",\"desc\":\"您的好友正在邀请您加入企业微信\"},\"quote_area\":{\"type\":1,\"url\":\"https://work.weixin.qq.com\",\"title\":\"企业微信的引用样式\",\"quote_text\":\"企业微信真好用呀真好用\"},\"sub_title_text\":\"下载企业微信还能抢红包！\",\"horizontal_content_list\":[{\"keyname\":\"邀请人\",\"value\":\"张三\"},{\"type\":1,\"keyname\":\"企业微信官网\",\"value\":\"点击访问\",\"url\":\"https://work.weixin.qq.com\"},{\"type\":2,\"keyname\":\"企业微信下载\",\"value\":\"企业微信.apk\",\"media_id\":\"文件的media_id\"},{\"type\":3,\"keyname\":\"员工信息\",\"value\":\"点击查看\",\"userid\":\"zhangsan\"}],\"card_action\":{\"type\":2,\"url\":\"https://work.weixin.qq.com\",\"appid\":\"小程序的appid\",\"pagepath\":\"/index.html\"},\"task_id\":\"task_id\",\"button_selection\":{\"question_key\":\"btn_question_key1\",\"title\":\"企业微信评分\",\"option_list\":[{\"id\":\"btn_selection_id1\",\"text\":\"100分\"},{\"id\":\"btn_selection_id2\",\"text\":\"101分\"}],\"selected_id\":\"btn_selection_id1\"},\"button_list\":[{\"text\":\"按钮1\",\"style\":1,\"key\":\"button_key_1\"},{\"text\":\"按钮2\",\"style\":2,\"key\":\"button_key_2\"}]},\"enable_id_trans\":0,\"enable_duplicate_check\":0,\"duplicate_check_interval\":1800}";
    JSONObject jsonObject = JSONObject.parseObject(jsonStr);
    System.out.println(jsonObject.toJSONString());



    String param = "";


//    System.out.println(a);
    param = "rrr";
    String a = "a" + param;
    System.out.println(a);
  }
}
