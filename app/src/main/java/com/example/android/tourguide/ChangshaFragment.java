package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ChangshaFragment extends Fragment {
    public ChangshaFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.list_attractions, container, false);


        String[] names = {"岳麓山","橘子洲","长沙世界之窗","火宫殿","天心阁","湖南省博物馆","烈士公园","雷锋纪念馆","开福寺","花明楼景区"};
        String[] details = {"故宫是世界上现存最大最完整的古代建筑群，也是人类珍贵的文化遗产。明清先后有二十四位皇帝在这里临朝为政和日常生活。它拥有世界上现存规模最大、保存最完整、建构最精致的古代宫殿建筑群，拥有150万件历史文物典籍和艺术工艺珍品，故宫博物院因此而举世闻名。",
                "八达岭长城史称天下九塞之一，是万里长城的精华，在明长城中，独具代表性。八达岭长城是万里长城向游人开得最早的地段，八达岭景区以八达岭长城为主，兴建了八达岭饭店、全周影院和由江泽民主席亲笔题名的中国长城博物馆等功能齐全的现代化旅游服务设施。八达岭景区以其宏伟的景观、完善的设施和深厚的文化历史内涵而著称于世。",
                "颐和园位于北京西北郊，主要由万寿山和昆明湖组成。早在元明时期，这里就以其优美自然的田园景色成为“壮观神州第一”的著名游览胜地。今之万寿山，元朝名瓮山，传说有一位老人在山上掘出一装满宝物的石瓮而得名。山前有湖名瓮山泊。",
                "恭王府，位于北京市西城区柳荫街，是全国重点文物保护单位，为清代规模最大的一座王府，曾先后作为和珅、永璘的宅邸。1851年恭亲王奕訢成为宅子的主人，恭王府的名称也因此得来。恭王府规模宏大，占地约6万平方米，分为府邸和花园两部分，拥有各式建筑群落30多处，布局讲究，气派非凡。",
                "圆明园坐落在北京西郊海淀，与颐和园紧相毗邻。它始建于康熙46年（1707年），由圆明、长春、绮春三园组成。占地350公顷，建筑面积近16万平方米，是清朝帝王在150余年间创建和经营的一座大型皇家宫苑。圆明园，曾以其宏大的地域规模、杰出的营造技艺、精美的建筑景群、丰富的文化收藏和博大精深的民族文化内涵而享誉于世，被誉为“一切造园艺术的典范”和“万园之园”。1860年10月惨遭英法联军洗劫并付之一炬。",
                "北京水立方位于北京奥林匹克公园内，2008年北京奥运会标志性建筑物之一。“水立方”与国家体育场“鸟巢”分别位于中轴线两侧，一方一圆，遥相呼应，构成了“人文奥运”的独特风景线。整个“水立方”分为4层，其中负一层是比赛工作区，一层和二层分别是游览区和观众席，三层为场馆预留经营场地。",
                "北京动物园始建于1906年，在西直门外乐善园、继园和广善寺、惠安寺“两园、两寺”旧址上的清“农事试验场”内，由商部奉旨筹建。园内由动物园、植物园、农事试验三部分组成。最早的动物园位于园内东侧，占地1.5公顷，是中国对公众开放最早的动物园和华北地区对公众开放最早的公园。据考此地也是中国现代动物园、植物园、博物馆的发祥地。",
                "北京工体富国海底世界是由中国和新西兰合作兴建的北京第一座五星级海洋水族馆。它拥有亚洲最长的亚克力胶水下隧道，是中国目前最大的人工“海底世界”之一！北京工体富国海底世界以“教育、娱乐、环境责任”为经营宗旨，通过高科技向游人展示神奇美丽的海底世界。",
                "观复博物馆主馆位于北京市朝阳区大山子张万坟金南路18号，馆长及创始人为文物专家马未都，成立于1996年10月30日，为公益性质博物馆，非营利性机构。",
                "北京国子监始建于元成宗大德十年（1306年），是中国元、明、清三代国家管理教育的最高行政机关和国家设立的最高学府。北京国子监坐落于安定门内国子监街上，与国子监一墙之隔的东侧是孔庙。"};
        String[] addresses = {"湖南省长沙市岳麓山风景名胜区内",
                "湖南省长沙市岳麓区橘子洲沙滩公园",
                "湖南省长沙市开福区三一大道485号",
                "湖南省长沙市天心区坡子街127号",
                "湖南省长沙市天心区天心路17号",
                "湖南省长沙市开福区东风路50号",
                "湖南省长沙市东风路1号",
                "湖南省长沙市望城县雷锋镇振兴路42号",
                "湖南省长沙市开福区开福寺路136号",
                "湖南省长沙市宁乡县花明楼镇"};
        int[] resourceIds = {};
        ArrayList<Attraction> atts = new ArrayList<>();
        for(int i = 0; i < names.length; i ++){
//            Attraction att = new Attraction(names[i], addresses[i], details[i], resourceIds[i]);
            Attraction att = new Attraction(names[i], addresses[i], details[i]);
            atts.add(att);
        }

        ListView lv = (ListView) rootView.findViewById(R.id.list_view);
        lv.setAdapter(new AttractionAdapter(getActivity(), atts));
        return rootView;
    }
}
