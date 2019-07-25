package com.joker.mvvm;

import com.google.gson.annotations.SerializedName;
import com.joker.mvvm.base.BaseBean;

import java.io.Serializable;
import java.util.List;


public class LatestMovie extends BaseBean implements Serializable {

    /**
     * count : 10
     * start : 0
     * total : 50
     * subjects : [{"rating":{"max":10,"average":8.7,"details":{"1":35,"3":805,"2":102,"5":3888,"4":2841},"stars":"45","min":0},"genres":["喜剧","动画","奇幻"],"title":"哪吒之魔童降世","casts":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp"},"name_en":"Yanting Lü","name":"吕艳婷","alt":"https://movie.douban.com/celebrity/1419996/","id":"1419996"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563583632.39.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563583632.39.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563583632.39.webp"},"name_en":"Joseph","name":"囧森瑟夫","alt":"https://movie.douban.com/celebrity/1400125/","id":"1400125"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563156886.49.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563156886.49.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563156886.49.webp"},"name_en":"Mo Han","name":"瀚墨","alt":"https://movie.douban.com/celebrity/1400124/","id":"1400124"}],"durations":["110分钟"],"collect_count":71842,"mainland_pubdate":"2019-07-26","has_video":false,"original_title":"哪吒之魔童降世","subtype":"movie","directors":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp"},"name_en":"Yu Yang","name":"饺子","alt":"https://movie.douban.com/celebrity/1328441/","id":"1328441"}],"pubdates":["2019-07-13(大规模点映)","2019-07-26(中国大陆)"],"year":"2019","images":{"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp"},"alt":"https://movie.douban.com/subject/26794435/","id":"26794435"},{"rating":{"max":10,"average":6.2,"details":{"1":492,"3":2680,"2":1288,"5":664,"4":1531},"stars":"30","min":0},"genres":["剧情"],"title":"银河补习班","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.webp"},"name_en":"Chao Deng","name":"邓超","alt":"https://movie.douban.com/celebrity/1274235/","id":"1274235"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1530362237.95.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1530362237.95.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1530362237.95.webp"},"name_en":"Yu Bai","name":"白宇","alt":"https://movie.douban.com/celebrity/1337887/","id":"1337887"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1478066140.77.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1478066140.77.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1478066140.77.webp"},"name_en":"Suxi Ren","name":"任素汐","alt":"https://movie.douban.com/celebrity/1362973/","id":"1362973"}],"durations":["147分钟"],"collect_count":87093,"mainland_pubdate":"2019-07-18","has_video":false,"original_title":"银河补习班","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p805.webp"},"name_en":"Chao Deng","name":"邓超","alt":"https://movie.douban.com/celebrity/1274235/","id":"1274235"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36973.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36973.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p36973.webp"},"name_en":"Baimei Yu","name":"俞白眉","alt":"https://movie.douban.com/celebrity/1316617/","id":"1316617"}],"pubdates":["2019-07-13(大规模点映)","2019-07-18(中国大陆)"],"year":"2019","images":{"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561542089.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561542089.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561542089.webp"},"alt":"https://movie.douban.com/subject/30282387/","id":"30282387"},{"rating":{"max":10,"average":6.4,"details":{"1":13,"3":98,"2":34,"5":30,"4":46},"stars":"35","min":0},"genres":["剧情","喜剧","犯罪"],"title":"灰猴","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1371633861.75.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1371633861.75.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1371633861.75.webp"},"name_en":"Dazhi Wang","name":"王大治","alt":"https://movie.douban.com/celebrity/1314858/","id":"1314858"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53419.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53419.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p53419.webp"},"name_en":"Feng Gao","name":"高峰","alt":"https://movie.douban.com/celebrity/1275669/","id":"1275669"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1374382499.95.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1374382499.95.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1374382499.95.webp"},"name_en":"Jingyun Wang","name":"王靖云","alt":"https://movie.douban.com/celebrity/1328159/","id":"1328159"}],"durations":["98分钟"],"collect_count":1551,"mainland_pubdate":"2019-07-23","has_video":false,"original_title":"灰猴","subtype":"movie","directors":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534008742.7.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534008742.7.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534008742.7.webp"},"name_en":"Pu Zhang","name":"张璞","alt":"https://movie.douban.com/celebrity/1398757/","id":"1398757"}],"pubdates":["2018-09-01(蒙特利尔国际电影节)","2019-07-23(中国大陆)"],"year":"2018","images":{"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561541477.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561541477.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561541477.webp"},"alt":"https://movie.douban.com/subject/27199913/","id":"27199913"},{"rating":{"max":10,"average":7.4,"details":{"1":174,"3":9405,"2":1173,"5":4655,"4":11141},"stars":"40","min":0},"genres":["剧情","动画","冒险"],"title":"狮子王","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp"},"name_en":"Donald Glover","name":"唐纳德·格洛弗","alt":"https://movie.douban.com/celebrity/1314061/","id":"1314061"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp"},"name_en":"Alfre Woodard","name":"阿尔法·伍达德","alt":"https://movie.douban.com/celebrity/1041159/","id":"1041159"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp"},"name_en":"James Earl Jones","name":"詹姆斯·厄尔·琼斯","alt":"https://movie.douban.com/celebrity/1013800/","id":"1013800"}],"durations":["118分钟"],"collect_count":155353,"mainland_pubdate":"2019-07-12","has_video":false,"original_title":"The Lion King","subtype":"movie","directors":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp"},"name_en":"Jon Favreau","name":"乔恩·费儒","alt":"https://movie.douban.com/celebrity/1027164/","id":"1027164"}],"pubdates":["2019-07-12(中国大陆)","2019-07-19(美国)"],"year":"2019","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp"},"alt":"https://movie.douban.com/subject/26884354/","id":"26884354"},{"rating":{"max":10,"average":6.2,"details":{"1":320,"3":6413,"2":2005,"5":621,"4":2657},"stars":"35","min":0},"genres":["剧情","动作","犯罪"],"title":"扫毒2天地对决","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1378956633.91.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1378956633.91.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1378956633.91.webp"},"name_en":"Andy Lau","name":"刘德华","alt":"https://movie.douban.com/celebrity/1054424/","id":"1054424"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1421047436.79.webp"},"name_en":"Louis Koo","name":"古天乐","alt":"https://movie.douban.com/celebrity/1027577/","id":"1027577"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2247.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2247.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p2247.webp"},"name_en":"Kiu Wai Miu","name":"苗侨伟","alt":"https://movie.douban.com/celebrity/1115415/","id":"1115415"}],"durations":["99分钟"],"collect_count":96763,"mainland_pubdate":"2019-07-05","has_video":false,"original_title":"掃毒2：天地對決","subtype":"movie","directors":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28346.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28346.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28346.webp"},"name_en":"Herman Yau","name":"邱礼涛","alt":"https://movie.douban.com/celebrity/1274313/","id":"1274313"}],"pubdates":["2019-07-05(中国大陆)","2019-07-16(香港)"],"year":"2019","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561172733.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561172733.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561172733.webp"},"alt":"https://movie.douban.com/subject/30171425/","id":"30171425"},{"rating":{"max":10,"average":8,"details":{"1":25,"3":406,"2":87,"5":659,"4":653},"stars":"40","min":0},"genres":["爱情","动画","奇幻"],"title":"游戏人生 零","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497789604.25.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497789604.25.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1497789604.25.webp"},"name_en":"Yoshitsugu Matsuoka","name":"松冈祯丞","alt":"https://movie.douban.com/celebrity/1314691/","id":"1314691"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1366715194.78.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1366715194.78.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1366715194.78.webp"},"name_en":"Ai Kayano","name":"茅野爱衣","alt":"https://movie.douban.com/celebrity/1314532/","id":"1314532"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23363.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23363.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p23363.webp"},"name_en":"Yoko Hikasa","name":"日笠阳子","alt":"https://movie.douban.com/celebrity/1275199/","id":"1275199"}],"durations":["107分钟"],"collect_count":15845,"mainland_pubdate":"2019-07-19","has_video":false,"original_title":"ノーゲーム・ノーライフ ゼロ","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21643.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21643.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p21643.webp"},"name_en":"Atsuko Ishizuka","name":"石塚敦子","alt":"https://movie.douban.com/celebrity/1314066/","id":"1314066"}],"pubdates":["2017-07-15(日本)","2019-07-19(中国大陆)"],"year":"2017","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561782374.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561782374.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561782374.webp"},"alt":"https://movie.douban.com/subject/26837952/","id":"26837952"},{"rating":{"max":10,"average":6,"details":{"1":57,"3":330,"2":164,"5":70,"4":130},"stars":"30","min":0},"genres":["科幻","动画","冒险"],"title":"未来机器城","casts":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534766432.19.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534766432.19.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534766432.19.webp"},"name_en":"Yingdi Han","name":"韩莹棣","alt":"https://movie.douban.com/celebrity/1399479/","id":"1399479"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534766550.03.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534766550.03.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1534766550.03.webp"},"name_en":"Haiyin Zheng","name":"郑海音","alt":"https://movie.douban.com/celebrity/1399480/","id":"1399480"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381744526.75.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381744526.75.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1381744526.75.webp"},"name_en":"Yuanzheng Feng","name":"冯远征","alt":"https://movie.douban.com/celebrity/1043136/","id":"1043136"}],"durations":["107分钟","106分钟(美国)"],"collect_count":7939,"mainland_pubdate":"2019-07-19","has_video":false,"original_title":"未来机器城","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1562743087.12.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1562743087.12.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1562743087.12.webp"},"name_en":"Kevin R. Adams","name":"安恪温","alt":"https://movie.douban.com/celebrity/1392324/","id":"1392324"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1562743106.05.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1562743106.05.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1562743106.05.webp"},"name_en":"Joe Ksander","name":"龙子乔","alt":"https://movie.douban.com/celebrity/1308172/","id":"1308172"}],"pubdates":["2018-09-07(美国)","2019-07-19(中国大陆)"],"year":"2018","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561782665.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561782665.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561782665.webp"},"alt":"https://movie.douban.com/subject/27200988/","id":"27200988"},{"rating":{"max":10,"average":0,"details":{"1":0,"3":0,"2":0,"5":0,"4":0},"stars":"00","min":0},"genres":["剧情"],"title":"小Q","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32971.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32971.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p32971.webp"},"name_en":"Simon Yam","name":"任达华","alt":"https://movie.douban.com/celebrity/1031194/","id":"1031194"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28520.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28520.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28520.webp"},"name_en":"Gigi Leung","name":"梁咏琪","alt":"https://movie.douban.com/celebrity/1000975/","id":"1000975"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48629.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48629.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p48629.webp"},"name_en":"Chung Him Law","name":"罗仲谦","alt":"https://movie.douban.com/celebrity/1313369/","id":"1313369"}],"durations":["107分钟"],"collect_count":5269,"mainland_pubdate":"2019-09-20","has_video":false,"original_title":"小Q","subtype":"movie","directors":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502838865.87.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502838865.87.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502838865.87.webp"},"name_en":"Wing-cheong Law","name":"罗永昌","alt":"https://movie.douban.com/celebrity/1274489/","id":"1274489"}],"pubdates":["2019-08-15(香港)","2019-09-20(中国大陆)"],"year":"2019","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2562586945.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2562586945.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2562586945.webp"},"alt":"https://movie.douban.com/subject/30376977/","id":"30376977"},{"rating":{"max":10,"average":7.9,"details":{"1":226,"3":12046,"2":1101,"5":13487,"4":25582},"stars":"40","min":0},"genres":["动作","科幻","冒险"],"title":"蜘蛛侠：英雄远征","casts":[{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467942867.09.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467942867.09.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467942867.09.webp"},"name_en":"Tom Holland","name":"汤姆·赫兰德","alt":"https://movie.douban.com/celebrity/1325351/","id":"1325351"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1543479263.47.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1543479263.47.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1543479263.47.webp"},"name_en":"Zendaya","name":"赞达亚","alt":"https://movie.douban.com/celebrity/1325576/","id":"1325576"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12737.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12737.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12737.webp"},"name_en":"Jake Gyllenhaal","name":"杰克·吉伦哈尔","alt":"https://movie.douban.com/celebrity/1048002/","id":"1048002"}],"durations":["127分钟"],"collect_count":353826,"mainland_pubdate":"2019-06-28","has_video":false,"original_title":"Spider-Man: Far from Home","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1435142487.62.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1435142487.62.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1435142487.62.webp"},"name_en":"Jon Watts","name":"乔·沃茨","alt":"https://movie.douban.com/celebrity/1350194/","id":"1350194"}],"pubdates":["2019-06-28(中国大陆)","2019-07-02(美国)"],"year":"2019","images":{"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2558293106.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2558293106.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2558293106.webp"},"alt":"https://movie.douban.com/subject/26931786/","id":"26931786"},{"rating":{"max":10,"average":7.6,"details":{"1":5,"3":763,"2":46,"5":362,"4":1135},"stars":"40","min":0},"genres":["剧情","犯罪","悬疑"],"title":"巴比龙","casts":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1410114704.04.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1410114704.04.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1410114704.04.webp"},"name_en":"Charlie Hunnam","name":"查理·汉纳姆","alt":"https://movie.douban.com/celebrity/1000024/","id":"1000024"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1860.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1860.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1860.webp"},"name_en":"Rami Malek","name":"拉米·马雷克","alt":"https://movie.douban.com/celebrity/1044903/","id":"1044903"},{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4770.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4770.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p4770.webp"},"name_en":"Tommy Flanagan","name":"汤米·弗拉纳根","alt":"https://movie.douban.com/celebrity/1081424/","id":"1081424"}],"durations":["133分钟"],"collect_count":12019,"mainland_pubdate":"2019-07-26","has_video":false,"original_title":"Papillon","subtype":"movie","directors":[{"avatars":{"small":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502196986.05.webp","large":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502196986.05.webp","medium":"http://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502196986.05.webp"},"name_en":"Michael Noer","name":"迈克尔·诺尔","alt":"https://movie.douban.com/celebrity/1328562/","id":"1328562"}],"pubdates":["2017-09-07(多伦多电影节)","2018-08-24(美国)","2019-07-26(中国大陆)"],"year":"2017","images":{"small":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561899354.webp","large":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561899354.webp","medium":"http://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561899354.webp"},"alt":"https://movie.douban.com/subject/26636537/","id":"26636537"}]
     * title : 正在上映的电影-北京
     */

    private int count;
    private int start;
    private int total;
    private String title;
    private List<SubjectsBean> subjects;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {
        /**
         * rating : {"max":10,"average":8.7,"details":{"1":35,"3":805,"2":102,"5":3888,"4":2841},"stars":"45","min":0}
         * genres : ["喜剧","动画","奇幻"]
         * title : 哪吒之魔童降世
         * casts : [{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp"},"name_en":"Yanting Lü","name":"吕艳婷","alt":"https://movie.douban.com/celebrity/1419996/","id":"1419996"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563583632.39.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563583632.39.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563583632.39.webp"},"name_en":"Joseph","name":"囧森瑟夫","alt":"https://movie.douban.com/celebrity/1400125/","id":"1400125"},{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563156886.49.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563156886.49.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563156886.49.webp"},"name_en":"Mo Han","name":"瀚墨","alt":"https://movie.douban.com/celebrity/1400124/","id":"1400124"}]
         * durations : ["110分钟"]
         * collect_count : 71842
         * mainland_pubdate : 2019-07-26
         * has_video : false
         * original_title : 哪吒之魔童降世
         * subtype : movie
         * directors : [{"avatars":{"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp"},"name_en":"Yu Yang","name":"饺子","alt":"https://movie.douban.com/celebrity/1328441/","id":"1328441"}]
         * pubdates : ["2019-07-13(大规模点映)","2019-07-26(中国大陆)"]
         * year : 2019
         * images : {"small":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp","large":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp","medium":"http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp"}
         * alt : https://movie.douban.com/subject/26794435/
         * id : 26794435
         */

        private RatingBean rating;
        private String title;
        private int collect_count;
        private String mainland_pubdate;
        private boolean has_video;
        private String original_title;
        private String subtype;
        private String year;
        private ImagesBean images;
        private String alt;
        private String id;
        private List<String> genres;
        private List<CastsBean> casts;
        private List<String> durations;
        private List<DirectorsBean> directors;
        private List<String> pubdates;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getCollect_count() {
            return collect_count;
        }

        public void setCollect_count(int collect_count) {
            this.collect_count = collect_count;
        }

        public String getMainland_pubdate() {
            return mainland_pubdate;
        }

        public void setMainland_pubdate(String mainland_pubdate) {
            this.mainland_pubdate = mainland_pubdate;
        }

        public boolean isHas_video() {
            return has_video;
        }

        public void setHas_video(boolean has_video) {
            this.has_video = has_video;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getSubtype() {
            return subtype;
        }

        public void setSubtype(String subtype) {
            this.subtype = subtype;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public List<CastsBean> getCasts() {
            return casts;
        }

        public void setCasts(List<CastsBean> casts) {
            this.casts = casts;
        }

        public List<String> getDurations() {
            return durations;
        }

        public void setDurations(List<String> durations) {
            this.durations = durations;
        }

        public List<DirectorsBean> getDirectors() {
            return directors;
        }

        public void setDirectors(List<DirectorsBean> directors) {
            this.directors = directors;
        }

        public List<String> getPubdates() {
            return pubdates;
        }

        public void setPubdates(List<String> pubdates) {
            this.pubdates = pubdates;
        }

        public static class RatingBean {
            /**
             * max : 10
             * average : 8.7
             * details : {"1":35,"3":805,"2":102,"5":3888,"4":2841}
             * stars : 45
             * min : 0
             */

            private int max;
            private double average;
            private DetailsBean details;
            private String stars;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public double getAverage() {
                return average;
            }

            public void setAverage(double average) {
                this.average = average;
            }

            public DetailsBean getDetails() {
                return details;
            }

            public void setDetails(DetailsBean details) {
                this.details = details;
            }

            public String getStars() {
                return stars;
            }

            public void setStars(String stars) {
                this.stars = stars;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }

            public static class DetailsBean {
                /**
                 * 1 : 35.0
                 * 3 : 805.0
                 * 2 : 102.0
                 * 5 : 3888.0
                 * 4 : 2841.0
                 */

                @SerializedName("1")
                private double _$1;
                @SerializedName("3")
                private double _$3;
                @SerializedName("2")
                private double _$2;
                @SerializedName("5")
                private double _$5;
                @SerializedName("4")
                private double _$4;

                public double get_$1() {
                    return _$1;
                }

                public void set_$1(double _$1) {
                    this._$1 = _$1;
                }

                public double get_$3() {
                    return _$3;
                }

                public void set_$3(double _$3) {
                    this._$3 = _$3;
                }

                public double get_$2() {
                    return _$2;
                }

                public void set_$2(double _$2) {
                    this._$2 = _$2;
                }

                public double get_$5() {
                    return _$5;
                }

                public void set_$5(double _$5) {
                    this._$5 = _$5;
                }

                public double get_$4() {
                    return _$4;
                }

                public void set_$4(double _$4) {
                    this._$4 = _$4;
                }
            }
        }

        public static class ImagesBean {
            /**
             * small : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp
             * large : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp
             * medium : http://img3.doubanio.com/view/photo/s_ratio_poster/public/p2561876698.webp
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class CastsBean {
            /**
             * avatars : {"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp"}
             * name_en : Yanting Lü
             * name : 吕艳婷
             * alt : https://movie.douban.com/celebrity/1419996/
             * id : 1419996
             */

            private AvatarsBean avatars;
            private String name_en;
            private String name;
            private String alt;
            private String id;

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBean {
                /**
                 * small : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp
                 * large : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp
                 * medium : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1563251143.18.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }

        public static class DirectorsBean {
            /**
             * avatars : {"small":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp","large":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp","medium":"http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp"}
             * name_en : Yu Yang
             * name : 饺子
             * alt : https://movie.douban.com/celebrity/1328441/
             * id : 1328441
             */

            private AvatarsBeanX avatars;
            private String name_en;
            private String name;
            private String alt;
            private String id;

            public AvatarsBeanX getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBeanX avatars) {
                this.avatars = avatars;
            }

            public String getName_en() {
                return name_en;
            }

            public void setName_en(String name_en) {
                this.name_en = name_en;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class AvatarsBeanX {
                /**
                 * small : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp
                 * large : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp
                 * medium : http://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1547719747.9.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }
        }
    }
}



