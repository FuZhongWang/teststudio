package com.example.fuzhongwang.teststudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    String s = "{\n" +
            "    \"errcode\": 0,\n" +
            "    \"errmsg\": \"OK\",\n" +
            "    \"data\": {\n" +
            "        \"total\": 2,\n" +
            "        \"list\": [\n" +
            "            {\n" +
            "                \"course_id\": \"121\",\n" +
            "                \"title\": \"新棋局·瞰长江\",\n" +
            "                \"oid\": \"1\",\n" +
            "                \"start_time\": \"2018-06-12 15:22:19\",\n" +
            "                \"end_time\": \"2018-12-31 23:59:59\",\n" +
            "                \"public\": \"1\",\n" +
            "                \"published\": \"1\",\n" +
            "                \"premium\": \"0\",\n" +
            "                \"price\": \"0.00\",\n" +
            "                \"creator\": \"37\",\n" +
            "                \"grades\": \"0.0\",\n" +
            "                \"comment_num\": 0,\n" +
            "                \"created_at\": \"2018-06-12 15:22:03\",\n" +
            "                \"updated_at\": \"2018-06-14 16:55:47\",\n" +
            "                \"description\": \"长江沿岸生态环境复杂多样，物种繁多，万里江河描绘着不同地区的生态图景。这一集我们讲述的是人与自然和谐相处的故事。 勤劳与坚韧是万千劳动者与生俱来的特质。他们辛苦劳作，只为创造更好的生活。这一集我们讲述的是长江沿岸劳动者勤勉致富、协调发展的故事。 　多元的社会能够容纳不同的生活方式。长江沿岸的人们不再固守原本的生活，而是执着追寻梦想。这一集我们讲述的是长江两岸的人们创新求变的故事。中华文明吸引着远方的来客。从都市到乡村，本土文化与外来文化产生了奇妙的碰撞。这一集我们讲述的是中外文化在长江流域交织融合的故事。 长江横贯东西，承载着“黄金水道”的作用。人们用智慧创造了人类伟大工程的奇迹，书写着追星逐月的传奇。这一集我们讲述的是长江流域人民共享发展成果的故事。 \",\n" +
            "                \"cover\": \"http://ndmooc-nds.oss-cn-qingdao.aliyuncs.com/admin_api/0/WebUpload/152878845566152878845566.jpg\",\n" +
            "                \"requirement\": \"\",\n" +
            "                \"live\": 0,\n" +
            "                \"student_num\": 16,\n" +
            "                \"identity\": \"2\",\n" +
            "                \"unit\": {\n" +
            "                    \"unit_id\": \"A304\",\n" +
            "                    \"unit_title\": \"第二集：众生之愿\",\n" +
            "                    \"unit_description\": \"\",\n" +
            "                    \"unit_cover\": \"\"\n" +
            "                },\n" +
            "                \"teachers\": [\n" +
            "                    {\n" +
            "                        \"teacher_uid\": \"37\",\n" +
            "                        \"teacher_identity\": \"1\",\n" +
            "                        \"teacher_created_at\": \"2018-06-12 15:22:03\",\n" +
            "                        \"teacher_nickname\": \"火燎的金刚烟熏的太岁\",\n" +
            "                        \"teacher_avatar\": \"https://file.ndmooc.com/user/79/64/37/avatar.jpg\",\n" +
            "                        \"teacher_tpuid_1\": \"47\",\n" +
            "                        \"teacher_signature\": \"我什么都没说~\",\n" +
            "                        \"teacher_introduce\": \"\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"config\": {\n" +
            "                    \"period\": 6\n" +
            "                },\n" +
            "                \"userinfo\": {\n" +
            "                    \"user_identity\": \"2\",\n" +
            "                    \"user_created_at\": \"2018-06-15 21:41:40\"\n" +
            "                }\n" +
            "            },\n" +
            "            {\n" +
            "                \"course_id\": \"120\",\n" +
            "                \"title\": \"计算机网络\",\n" +
            "                \"oid\": \"1\",\n" +
            "                \"start_time\": \"2018-06-12 11:59:00\",\n" +
            "                \"end_time\": \"2018-10-31 11:59:00\",\n" +
            "                \"public\": \"1\",\n" +
            "                \"published\": \"1\",\n" +
            "                \"premium\": \"0\",\n" +
            "                \"price\": \"0.00\",\n" +
            "                \"creator\": \"36\",\n" +
            "                \"grades\": \"0.0\",\n" +
            "                \"comment_num\": 0,\n" +
            "                \"created_at\": \"2018-06-12 14:39:55\",\n" +
            "                \"updated_at\": \"2018-06-13 09:32:11\",\n" +
            "                \"description\": \"是计算机类专业的学位必修课程，是研究生入学统一考试中的计综科目之一。围绕参考模型，用7张思维导图，带你探讨信息从源到目的，穿越中间交换设备所遇到的问题和解决办法；涵盖基本原理和重要协议。不管你是对计算机网络感兴趣，还是考研，亦或是考取相关证书，本课程都是你不错的选择!\\n—— 课程团队\\n\\n 课程概述\\n      以层次模型为线索，一层一章（数据链路层两章），将内容有机地串在一起；主要包括网络相关术语和协议（TCP/IP协议栈）、网络标准、OSI参考模型、局域网技术（重点以太网）、物理层、数据链路层、网络层、传输层和应用层的基本功能和基本原理；重点学习网络层内容，包括各种路由协议的工作原理及其特点。在学习理论的基础上，初步培养网络编程、网络抓包工具使用、交换机和路由器操作等实际动手能力。\\n      7张（章）思维导图，既有清晰的脉络，又有技术细节，收放自如，带你深入计算机网络的背后，看清信息的流转，囊括重要的原理、技术和协议。\\n      除了满满的干货，你还将在课程中了解到网络发展进程中的名人及背后的奇闻轶事，比如：互联网之父温顿•瑟夫（Vinton Gray Cerf）、以太网之父罗伯特•梅特卡夫（Robert Metcalfe）、万维网之父蒂姆•伯纳斯•李（Tim Berners Lee）、CDMA之母海蒂•拉玛（Hedy Lamarr）、第一台路由器发明者和思科创始者昂纳德•波萨克（Leonard Bosack）和桑德拉•勒纳（Sandy Lerner）夫妇、高锟、拉迪雅•铂尔曼（Radia perlman）......也许没有他们的发明，网络世界会是另外一个样子，这些名字背后的传奇故事，是网络知识宝塔上闪亮的珠缀，将带给你无限的感叹和畅想。\",\n" +
            "                \"cover\": \"https://canvas.ndmooc.com/tmp/files/0000/0486/1528853517_393__37428157-3b37-4494-9205-eb014108e995.jpg\",\n" +
            "                \"requirement\": \"\",\n" +
            "                \"live\": 0,\n" +
            "                \"student_num\": 12,\n" +
            "                \"identity\": \"2\",\n" +
            "                \"unit\": {\n" +
            "                    \"unit_id\": \"A317\",\n" +
            "                    \"unit_title\": \"10、物理层设备\",\n" +
            "                    \"unit_description\": \"\",\n" +
            "                    \"unit_cover\": \"\"\n" +
            "                },\n" +
            "                \"teachers\": [\n" +
            "                    {\n" +
            "                        \"teacher_uid\": \"36\",\n" +
            "                        \"teacher_identity\": \"1\",\n" +
            "                        \"teacher_created_at\": \"2018-06-12 14:39:55\",\n" +
            "                        \"teacher_nickname\": \"古月\",\n" +
            "                        \"teacher_avatar\": \"https://file.ndmooc.com/user/ea/63/36/avatar.jpg\",\n" +
            "                        \"teacher_tpuid_1\": \"46\",\n" +
            "                        \"teacher_signature\": \"\",\n" +
            "                        \"teacher_introduce\": \"\"\n" +
            "                    }\n" +
            "                ],\n" +
            "                \"config\": {\n" +
            "                    \"period\": 30\n" +
            "                },\n" +
            "                \"userinfo\": {\n" +
            "                    \"user_identity\": \"2\",\n" +
            "                    \"user_created_at\": \"2018-06-18 20:49:03\"\n" +
            "                }\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        TestBean testBean = gson.fromJson(s, TestBean.class);
        Log.e("naocan", "onCreate: "+testBean.getData().getList().get(0).getEnd_time());
    }
}
