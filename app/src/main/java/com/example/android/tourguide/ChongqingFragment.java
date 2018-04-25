package com.example.android.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ChongqingFragment extends Fragment {
    public ChongqingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.list_attractions, container, false);


        String[] names = {"磁器口古镇","解放碑步行街","洪崖洞商业街","白公馆","渣滓洞","武隆天生三桥","大足石刻","罗汉寺","三峡博物馆"};
        String[] details = {"磁器口古镇位于重庆市沙坪坝区嘉陵江畔，始建于宋代，拥有“一江两溪三山四街”的独特地貌，形成天然良港，是嘉陵江边重要的水陆码头。曾经“白日里千人拱手，入夜后万盏明灯”繁盛一时。\n磁器口古镇蕴含丰富的巴渝文化、宗教文化、沙磁文化、红岩文化和民间文化，各具特色。一条石板路，千年磁器口，是重庆古城的缩影和象征，被赞誉为“小重庆”。",
                "解放碑步行街位于重庆市渝中区，历来就是重庆最繁华的商业中心地带。这里有数量众多的百货公司、酒店、饭店等，是重庆购物、美食和走走逛逛的好去处，重庆时尚地标之一。当然，这里更是来重庆打望美女的绝佳去处。步行街以解放碑为中心，包括周边的民权路、民族路、邹容路和八一路和五一路等。\n商场多，小吃多，美女多，是步行街“三多”。你在这里可以逛逛“高大上”的美美时代百货、大都会广场，也有比较平民的重庆百货大楼和太平洋百货；在步行街上你几乎能吃到所有的重庆美食和小吃，这里有八一路好吃街，便宜又好吃的酸辣粉、山城小汤圆和抄手都能在这里找到。而当你步行街上闲逛时，没走几步，就会有一位身材高挑，皮肤白皙的重庆美眉从你身边闪过。",
                "洪崖洞是逛山城老街、观赏两江风光、品尝当地美食的好去处。商业街位于渝中区沧白路，长江、嘉陵江两江交汇的滨江地带，以具有巴渝传统建筑特色的“吊脚楼”为主体，依山就势，沿江而建。夜景美爆了洪崖洞由纸盐河酒吧街、天成巷巴渝风情街、盛宴美食街及异域风情城市阳台四部分组成，以最具巴渝传统建筑特色的吊脚楼为主体，依山就势，通过分层筑台、吊脚、错叠、临崖等山地建筑手法，把这一片建筑汇聚在一起，夜晚时候灯火通明，堪称山城一景。美食、购物、观景走进洪崖洞，两边都是密集的吊脚楼。从脚下的沿江路到顶层的沧白路有11层之多。隔层功能不同，有餐馆、有小吃街、有酒吧咖啡厅，也有土特产商铺。顶层既是异域风情城市阳台，可乘坐电梯直达。站在观景平台上，可远观两江交汇，风光极佳。旁边还有烽火墙和青铜塑造的大炮，著名的海盗酒吧，都让人流连忘返。",
                "白公馆位于重庆市沙坪坝区歌乐山，是一处缅怀英烈的革命遗迹，原为四川军阀白驹的郊外别墅，白驹自诩是白居易的后代，借用白居易别号“香山居士”，把别墅取名为“香山别墅”。1939年，军统特务头子戴笠用重金将它买下，改造为迫害革命者的监狱。\n1943年中美特种技术合作所成立，白公馆作为中美合作所第三招待所，关押人员被移往附近的渣滓洞。抗战胜利后，白公馆被作为特别看守所。1947年春，渣滓洞“人犯”又迁回白公馆关押。",
                "在重庆市歌乐山麓，距白公馆2.5公里。渣滓洞原是重庆郊外的一个小煤窑，因渣多煤少而得名。渣滓洞三面是山，一面是沟，位置较隐蔽。1939年，国民党军统特务逼死矿主，霸占煤窑，在此设立了监狱。分内外两院，外院为特务办公室、刑讯室等，内院一楼一底16间房间为男牢，另有两间平房为女牢。",
                "天生三桥位于重庆市武隆县城东南20公里的白果乡与核桃乡交界处，是世界上最大的天生桥群。距“南国牧原”仙女山15公里，交通十分便利。大自然的鬼斧神工造就了这3座天生的石拱桥，使其具有雄、奇、险、秀、幽、绝等众多特点，虽历经千万年的风风雨雨，至今却依然如故。天生三桥风景区内，林木清秀，植被丰厚，苍翠欲滴，飞泉流瀑遍布其间，包容了山、水、泉、峡、峰、瀑等众多景色。灌木丛生，覆盖三桥，更显得三桥历经千年之沧桑。天生三桥地处仙女山南部，位居仙女山与武隆县之间，天生三桥景区内天生石桥气势磅礴，林森木秀、飞泉流瀑，包容了山、水、雾、泉、峡、峰、溪、瀑，是一处高品位的生态旅游区。天生三桥由天龙桥、青龙桥、黑龙桥组成，气势磅礴、恢宏其规模庞大、气势磅礴称奇于世，是亚洲最大的天生桥群。桥平均高度为200米以上，桥面宽约100米，三座桥呈纵向排列，平行横跨在羊水河峡谷上，将两岸山体连在一起，在距离几百米之内就有如此宏大的三座天生石拱桥实属国内罕见、世界稀有，是亚洲最大的天生桥群，真不愧为自然界留给人类的宝贵财富。",
                "大足石刻是位于中国西南大足区境内所有石窟造像的总称，迄今公布为文物保护单位的石窟多达75处，雕像五万余尊，它代表了公元9—13世纪世界石窟艺术的最高水平，是人类石窟艺术史上最后的丰碑。大足石刻始凿于公元七世纪的初唐时期，在九至十三世纪的两宋时期达到鼎盛。它从不同侧面展示了唐、宋时期中国石窟艺术风格的重大发展和变化，具有前期石窟不可替代的历史、艺术、科学价值。并以规模宏大、雕刻精美、题材多样、内涵丰富、保存完好而著称于世。1999年12月，以宝顶山、北山、南山、石门山、石篆山“五山”为代表的大足石刻，被联合国教科文组织列入《世界遗产名录》。",
                "重庆罗汉寺坐落在渝中区民族路，是全国汉族地区重点佛教寺庙之一。重庆市佛教协会设于此。罗汉寺始建于北宋治平年间（1064年—1067年），原名治平寺。寺因罗汉洞而建。清乾隆十七年(1752年)，因前殿坍圮，改建龙神祠。后又称罗汉寺、古佛岩。清光绪十一年(1885年)，隆法和尚重修庙宇，并仿新都宝光寺建罗汉堂，泥塑五百阿罗汉，方改名罗汉寺。1942年罗汉寺遭日机炸毁，后修复。“文化大革命”中，罗汉塑像全被捣毁，1984年政府拨专款重塑。",
                "三峡博物馆是保护、研究、展示重庆和三峡地区历史文化遗产与人类环境物证的公益性文化教育机构，是弘扬和培育民族精神的重要文化基础设施。三峡博物馆位于渝中区学田湾人民大礼堂的对面，主体建筑气势宏伟，内涵深邃。除正面与人民广场、人民大礼堂保持三位一体外，其余部分均顺地势地貌而建，并与山体融为一体，结合地势高差与建筑的围合与半围合，呈现出山水主题的园林景观，舒展平缓变化的体量似从山体中生长雕琢而成。",
                };
        String[] addresses = {"重庆市沙坪坝区磁器口镇",
                "重庆市渝中区解放碑周边区域",
                "重庆市渝中区嘉陵江滨江路88号",
                "重庆市沙坪坝区壮志路治法三村63号",
                "重庆市沙坪坝区渣滓洞景区22号",
                "重庆市武隆县城东南20公里的白果乡与核桃乡交界处",
                "重庆市大足区宝顶镇宝顶山石刻风景区",
                "重庆市渝中区罗汉寺街7号",
                "重庆市渝中区人民路236号"};
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
