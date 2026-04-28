package kr.hs.bsis.helloworld08.bsis2033;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kr.hs.bsis.helloworld08.bsis2033.Prob;

/* JADX INFO: compiled from: StoryLine.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\bN\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010R\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u000e\u0010U\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006W"}, d2 = {"Lkr/hs/bsis/helloworld08/bsis2033/StoryLine;", BuildConfig.FLAVOR, "()V", "TIME_LIMITED", BuildConfig.FLAVOR, "TIME_START", "game_ending", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkr/hs/bsis/helloworld08/bsis2033/Story;", "getGame_ending", "()Ljava/util/Map;", "game_ending_1", "game_ending_2", "game_over", "gas_station", "gas_station_1", "gas_station_1_1", "gas_station_2", "gas_station_2_1", "gas_station_move", "hospital", "hospital_1", "hospital_1_1", "hospital_1_1_201", "hospital_1_1_202", "hospital_1_1_203", "hospital_1_1_2F", "hospital_1_1_301", "hospital_1_1_302", "hospital_1_1_3F", "hospital_1_1_401", "hospital_1_1_401_1", "hospital_1_1_403", "hospital_1_1_4F", "hospital_1_2", "hospital_1_failed", "hospital_303", "hospital_303_2", "hospital_303_2_2", "hospital_303_2_2_1", "hospital_303_2_3", "hospital_303_2_3_1", "hospital_303_2_3_2", "hospital_303_Fight", "house", "house_1", "house_1_2", "house_1_3", "house_1_4", "house_move", "market", "market_1", "market_1_1", "market_1_1_1", "market_2", "market_2_1", "market_2_1_1", "market_2_2", "market_3", "market_move", "market_return", "police", "police_1", "police_1_1", "police_1_1_repeat", "police_1_2", "police_2", "police_code_18", "police_code_19", "police_code_20", "police_code_failed", "police_code_success", "police_move", "rotary", "rotary_1", "rotary_1_1", "rotary_1_1_1", "rotary_1_1_1_next", "rotary_1_1_2", "school", "school_move", "start", "getStart", "()Lkr/hs/bsis/helloworld08/bsis2033/Story;", "start_1", "start_2", "app_release"}, k = 1, mv = {1, 1, 15})
public final class StoryLine {
    public static final int TIME_LIMITED = 60;
    public static final int TIME_START = 1020;
    private static final Map<String, Story> game_ending;
    private static final Story game_over;
    private static final Story gas_station_1;
    private static final Story gas_station_1_1;
    private static final Story gas_station_2;
    private static final Story gas_station_2_1;
    private static final Story gas_station_move;
    private static final Story hospital_1;
    private static final Story hospital_1_1;
    private static final Story hospital_1_1_201;
    private static final Story hospital_1_1_202;
    private static final Story hospital_1_1_203;
    private static final Story hospital_1_1_2F;
    private static final Story hospital_1_1_301;
    private static final Story hospital_1_1_302;
    private static final Story hospital_1_1_3F;
    private static final Story hospital_1_1_401;
    private static final Story hospital_1_1_401_1;
    private static final Story hospital_1_1_403;
    private static final Story hospital_1_1_4F;
    private static final Story hospital_1_2;
    private static final Story hospital_1_failed;
    private static final Story hospital_303;
    private static final Story hospital_303_2;
    private static final Story hospital_303_2_2;
    private static final Story hospital_303_2_2_1;
    private static final Story hospital_303_2_3;
    private static final Story hospital_303_2_3_1;
    private static final Story hospital_303_2_3_2;
    private static final Story hospital_303_Fight;
    private static final Story house_1;
    private static final Story house_1_2;
    private static final Story house_1_3;
    private static final Story house_1_4;
    private static final Story house_move;
    private static final Story market_1;
    private static final Story market_1_1;
    private static final Story market_1_1_1;
    private static final Story market_2;
    private static final Story market_2_1;
    private static final Story market_2_1_1;
    private static final Story market_2_2;
    private static final Story market_3;
    private static final Story market_move;
    private static final Story market_return;
    private static final Story police_1;
    private static final Story police_1_1;
    private static final Story police_1_1_repeat;
    private static final Story police_1_2;
    private static final Story police_2;
    private static final Story police_code_18;
    private static final Story police_code_19;
    private static final Story police_code_20;
    private static final Story police_code_failed;
    private static final Story police_code_success;
    private static final Story police_move;
    private static final Story rotary_1;
    private static final Story rotary_1_1;
    private static final Story rotary_1_1_1;
    private static final Story rotary_1_1_1_next;
    private static final Story rotary_1_1_2;
    private static final Story school_move;
    private static final Story start;
    private static final Story start_1;
    private static final Story start_2;
    public static final StoryLine INSTANCE = new StoryLine();
    private static final Story rotary = new Story(StringsKt.trimIndent("\n\t\t로터리 쪽으로 나아가 보니 차들은 꽉 막힌 길에 멈추어 서 있고, 혼란에 빠진 운전 자들이 신경질적으로 클락션을 눌러대는 소리밖에 들리지 않는다. \n\t\t그리고 지나다니는 사람들이 상공을 가리키며 자기들끼리 걱정스러운 대화를 나눈다. \n\t\t\n\t\t“차들도 시동이 다 꺼지고 글쎄, 집에 전기도 다 나가고...”\n\t\t\n\t\t로터리 한가운데에서 사이렌 소리와 함께 정체 모를 두꺼운 장갑을 두른 검은 봉고차 한 대가 도로를 헤집으며 나타난다.\n\t\t\n\t\t“시민 여러분!” \n\t\t\n\t\t경찰 제복을 입은 나이 든 아저씨가 조수석 창문을 내리고 확성기를 들고 소리친다.\n\t\t\n\t\t“잠시 뒤에 ‘공무 집행’이라고 쓰인 커다란 버스랑 봉고차가 도착할 겁니다. 일단 거기에 탑승하시면 안전한 곳으로 이동을 한 뒤에 구청이랑 경찰서에서 안내를 해 드릴 예정입니다.” \n\t\t\n\t\t그의 말이 멈춘 틈을 타 누군가 소리쳤다.\n\t\t\n\t\t“대체 무슨 일이 벌어지는 겁니까? 핸드폰도 안 되고 전기도 안 들어와서 아무것도 못 하고 있잖아요!”\n\t\t\n\t\t경찰관이 얼굴을 찡그리더니 시끄러운 사이렌 소리를 다시 울려댄다. \n\t\t\n\t\t“어쨌든 18시까지, 늦어도 오후 6시까지는 이송 차량에 신속히 탑승을 해주셔야 합니다. \n\t\t지금 아시다시피 운행 가능한 차량이 한정적이니까 절대 늦지 마세요. 수상한 물체나 인물은 즉시 신고 해주세요.” \n\t\t\n\t\t공지를 마친 경찰관은 의문의 봉고차를 몰고 사라진다.\n\t"), "로터리");
    private static final Story school = new Story(StringsKt.trimIndent("\n\t\t9월이라도 역시 덥긴 덥다. \n\t\t학교가 산에 있어서 그런지 올라가는 데도 시간이 오래 걸리고 덥기도 훨씬 덥다. \n\t\t지금 시간이면.. 8교시다. 인터넷도 안 터지고 전화 연결도 안 되지만 우리 학교에서는 자주 있는 일이라 별로 신경 쓰지 않는 것 같다.\n\t\t지금 상황이 학교에 알려진다면 혼비백산이 되고 말 것이다.\n\t\t\n\t\t근데 내가 지금 이럴 시간이 있나? 어서 빨리 부품을 찾으러 가자!\n\t"), "학교");
    private static final Story police = new Story(StringsKt.trimIndent("\n\t\t경찰서 앞에 도착하자 빽빽하게 모인 사람들의 아우성으로 귀가 아프다. \n\t\t젊은 순경 둘이 경찰서 안으로 들어오려는 사람들을 힘들게 막아내고 있다. \n\t\t제각기 뭔가 다른 사정을 외치고 있다. 아이를 찾아달라느니, 집 문을 열어 달라느니, 가게가 털렸다느니.. \n\t\t경찰서 안으로 들어가려면 꽤 힘들 것 같다.\n\t"), "경찰서");
    private static final Story market = new Story(StringsKt.trimIndent("\n\t\t마트는 미친 듯이 물건을 카트에 쓸어담고 있는 사람들로 정신이 없다. \n\t\t직원들이나 보안요원 들은 어디 갔는지 보이지 않고, \n\t\t사람들은 각자 다들 식료품과 생필품으로 꽉꽉 찬 카트를 사납게 몰며 통조림 박스를 두고 다른 사람들과 치열한 몸싸움을 벌이고 있다. \n\t\t카키색 점퍼를 입은 아저씨 하나가 남들보다 유독 높게 쌓은 카트를 요리조리 몰며 마트를 누비고 있고, \n\t\t유치원생 정도 되어 보이는 아이 하나가 난리통 속에 엉엉 울고 있다.\n\t"), "마트");
    private static final Story house = new Story(StringsKt.trimIndent("\n\t\t집 앞에선 우리 아파트 이웃들이 다급하게 짐을 나르고 있다. \n\t\t피난 차량에 들고 탈 것들을 챙기려는 것 같다.\n\t"), "집");
    private static final Story gas_station = new Story(StringsKt.trimIndent("\n\t\t주유소에 도착했다. 역시나 이 곳도 차들로 엉켜있을 뿐만 아니라 성난 사람들이 서로 멱살을 붙잡고 싸우고 있다. \n\t\t어떤 사람들은 기름통을 서로 붙잡고 실랑이를 벌이며 욕설을 쏟아내기도 하고, \n\t\t어떤 사람들은 주유소 옆에 딸린 편의점에서 온갖 식료품들을 챙겨서 달아나고 있다. \n\t\t빼앗으려는 자와 지키려는 자들 사이에 몸싸움이 계속된다. \n\t\t이런 광경에 어울리지 않는 웬 강아지 한 마리가 난장판 속을 헤집으며 이리저리 돌아다니고 있고, \n\t\t선캡을 쓴 한 아주머니는 차 안에서 남자 아이를 안은 채 울고 있다.\n\t"), "주유소");
    private static final Story hospital = new Story(StringsKt.trimIndent("\n\t\t병원의 모습은 처참하다. 주차장에서 현관까지 환자들과 그 가족들, 의료 기구들이 아무렇게나 널브러져 있다. \n\t\t통곡하는 소리와 싸우는 소리, 고함소리가 간간이 병원 안쪽에서 들려온다.\n\t\t\n\t\t“의사 양반들, 밖은 신경 쓰지 말고 안에 있는 사람들이나 봐주쇼! 하람이 아빠, 응급실로는 사람 못 들어오게 지키고 있어.”\n\t\t\n\t\t다 해진 러닝셔츠를 입은 근육질의 몸집 큰 남자 하나가 야구방망 이를 어깨에 댄 채 한 손으로 다른 남자들을 지휘하고 있다. \n\t\t그의 손짓에 쇠파이프와 각목 등 으로 무장한 남자들이 우르르 병원 현관 앞을 지키러 달려온다. \n\t\t복장으로 보아 그 중 절반 정도는 그저 다들 평범한 동네 아빠들이었던 것 같다.\n\t\t\n\t\t“다 우리도 가족이 있어서 그러는 거니까 이해하세요, 선생님. 아시겠죠?”\n\t\t\n\t\t러닝셔츠를 입은 남자가 자신의 다리를 붙잡고 흐느끼는 노인의 손을 발로 밀쳐내며 말한다. \n\t\t병원에 들어가려면 좀 힘들겠는데..\n\t"), "병원");
    private static final Story game_ending_1 = new Story(StringsKt.trimIndent("\n\t\t병원 옥상에는 마트에서 봤던 아이 엄마가 무척 기뻐하며 나를 맞는다. \n\t\t모이기로 한 인원들을 확인하고, 가져온 물품들을 파악한 뒤 일행 중 한명이 준비한 헬기를 탄다.\n\t\t \n\t\t나는 지금 이 상황을 믿을 수 없어 밖을 내다본다. \n\t\t불길과 검은 연기가 치솟는 사하구의, 어쩌면 마지막일 지도 모르는 그 하늘 위로 수많은 새들이 횡대를 이루며 날아가는 모습이 햇빛을 받으며 묘한 장관을 연출해 낸다.\n\t\t\n\t\t드디어 부산일과학고등학교에 도착했다! \n\t\t부품이 들어갈 자리에 부품을 넣으니 기계음과 동시에 장막과 같은 게 학교 주위에 펼쳐진다. \n\t\t갑작스레 가동된 세이프 존에 이질감을 느낀 학생들과 교직원들이 밖을 쳐다보며 의아해한다. \n\t\t학교에 들어가서 모든 상황을 설명하였고, 선생님 들은 부산일과학고 지하 벙커에 있는 식량들을 이 사태가 끝날 때까지 학생들에게 지원하기로 약속하셨다. \n\t\t\n\t\t도대체 이 비참한 상황은 언제까지 이어지게 될까. \n\t\t하루? 일주일? 한 달? 1년? 아니, 그보다 더 걸릴지도 모르겠다. \n\t\t\n\t\t그렇지만 내가 우리 학교, 자랑스런 나의 모교를 걷잡을 수 없는 혼돈으로부터 구해 낸 영웅이 되었다는 사실은 \n\t\t부산일과학고등학교의 역사에 길이 남을 것이다.\n\t"), "굿엔딩");
    private static final Story game_ending_2 = new Story(StringsKt.trimIndent("\n\t\t병원 옥상에는 수많은 사람들이 모여 있다.\n\t\t사정을 설명했지만 자리가 남지 않아 결국 헬기에 타지 못했다.\n\t\t\n\t\t헬기가 떠나고 병원 옥상에는 나 혼자만 남았다.\n\t\t아래를 바라보니 불길과 검은 연기가 치솟고 있다.\n\t\t\n\t\t그 순간, 시끄러운 사이렌 소리와 함께 사방에서 뭐라고 외치는 소리가 들린다. \n\t\t차체 곳곳에 살벌하게 생긴 장갑을 덧댄 한 무리의 검은 차들이 한 줄로 빠르게 동네를 빠져나가는 것이 저 멀리에 보인다.\n\t\t\n\t\t차들이 떠나가자 사방에서 기분 나쁜 함성 소리와 야유 소리가 들린다. \n\t\t거듭되는 폭발음과 비명 소리.. 도시엔 진정한 혼란이 찾아오고 있다.\n\n\t\t나는 결국 부산일과학고등학교를 구할 수 없었다..\n\t\t1시간은 빠듯했다.. 단서를 찾고 계획을 세워야 한다. \n\t\t다시 한 시간 전으로 돌아갈 수만 있다면.\n\t"), "배드엔딩");

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 2;
        start = new Story(StringsKt.trimIndent("\n\t\t“회원님의 이용시간이 5분 남았습니다.”\n\t\t\n\t\t컴퓨터에서 나오는 목소리를 들으며 조금씩 잠에서 깬다.\n\t\t내가 여기서 뭘 하고 있었더라? 키보드를 깔아뭉갠 채 PC방에서 잠이 든 것 같다. \n\t\t잠깐, 오늘은 평일인데 왜 PC방에 있지? \n\t\t하.. 외출한답시고 나와서는 PC방에서 롤 한 판 땡긴다고 그랬었지. \n\t\t슬슬 돌아갈 때가 됐나, 하고 시각을 확인해 보니 17시 정각이다. \n\t\t18시까지는 학교로 돌아가야 하는데..\n\t"), null, i, 0 == true ? 1 : 0);
        start_1 = new Story("안 된다. 학교로 돌아갈 시간이 얼마 남지 않았다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        start_2 = new Story(StringsKt.trimIndent("\n\t\t9월의 따스한 햇살이 나를 반겨준다. \n\t\t한숨을 쉬고 학교로 올라가려는 그 때, 저 멀리 하늘에 이상한 검은 물체가 솟구쳐 올라가는 것이 보인다. \n\t\t새인가? 눈을 찡그리며 검은 물체를 유심히 지켜보던 나는 별안간 그것이 밝은 섬광을 내며 폭발하는 광경을 보고 깜짝 놀라 그대로 주저앉는다.\n\t\t\n\t\t..저게 뭐지? 미사일? 폭탄? \n\t\t\n\t\t“이건.. 김진필 선생님께 알려야 해.”\n\t\t\n\t\t하지만 이유를 모르게 전화가 전혀 터지지 않는다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        rotary_1 = new Story(StringsKt.trimIndent("\n\t\t갑자기 번뜩 생각이 들었다. \n\t\t부산일과학고등학교는 8기부터 개발되어 온 세이프 존이 2032년에 완성이 되었다는 것을. \n\t\t하지만 2018년부터 지금까지 16년째 근무하고 계신 최고참 김진필 선생님께서 말씀하시기를, 누군가의 계략으로 인해 그 세이프 존을 활성화시킬 핵심 부품이 사하구 어딘가에 버려져 있다고 하셨다. \n\t\t\n\t\t그러면 내가 해야할 것은 단 하나..! \n\t\t부산일과학고등학교 수호를 위해 1시간 안에 부품을 찾아야 한다!\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        rotary_1_1 = new Story(StringsKt.trimIndent("\n\t\t나는 먼지를 털고 일어나 직접 부품을 찾으러 가기로 결심한다. \n\t\t도로가 너무 혼잡해 서 뛰어서 이동하는 것이 낫겠다. \n\t\t장소를 이리저리 이동하여 부품이 있는 곳의 힌트를 얻어보자.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        rotary_1_1_1 = new Story(StringsKt.trimIndent("\n\t\t주위를 둘러보니 익숙한 아저씨가 보인다.\n\t\t\n\t\t“여, 주짓수 전국소년체전 금메달리스트 아니신가. 안 본 사이에 살이 많이 빠졌네?\n\t\t그나저나 이게 무슨 일이야, 너도 봤어? 하늘에서 뭔가 펑 터지는 걸?\n\t\t차가 오후.. 6시에 온댔지? 볼 일 빨리 보고 와. 기다리고 있을게.\"\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        rotary_1_1_1_next = new Story(StringsKt.trimIndent("\n\t\t\"그래? 그럼 어쩔 수 없지. 꼭 살아서 보자.\"\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        rotary_1_1_2 = new Story(StringsKt.trimIndent("\n\t\t다른 곳으로 가보자.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        school_move = new Story(" 어느 쪽으로 갈까?", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_1 = new Story(StringsKt.trimIndent("\n\t\t힘겹게 인파를 헤치고 가까스로 경찰서 문을 열었다. \n\t\t어린 친구가 어떻게 들어왔냐는 듯이 갸우뚱한 표정을 짓고 있는 경찰 하나가 나에게 무슨 용건이냐고 묻는다. \n\t\t\n\t\t“세이프 존 활 성화 부품이 있나 확인하러 왔ᄂ..” \n\t\t\n\t\t그 순간 안쪽에서 경찰 둘이 큰 소리로 다급하게 대화를 나누는 것이 들린다.\n\t\t\n\t\t“아주 자랑이다. 병원에서는 폭동으로 사람이 죽어 나가는데 서장님이랑 연락도 안 되고, 이젠 무기고 번호도 몰라서 총도 못 꺼내?!”\n\t\t\n\t\t나이 많은 경찰이 자신보다 한 참 후배로 보이는 경찰에게 다그친다.\n\t\t\n\t\t“아녜요, 할 수 있어요. 그때 서장님이 일과고가 설립된 연도라 했다니까요?”\n\t\t\n\t\t후배 경찰이 쪼그려 앉아 금고 다이얼을 열심히 돌리고 있다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_1_1 = new Story(StringsKt.trimIndent("\n\t\t“할 수 있으시겠어요? 그거 네 자리 비밀번호인데, 거기 총이 들어 있거든요.”\n\t\t\n\t\t나이 많은 경찰관이 도움이 절실한지 나에게 달려와 금고로 안내해준다.\n\t\t\n\t\t“저 녀석 말로는 무슨 연도라고 하니까 뭐.. 앞 두 자리는 19? 20? 아니면 혹시 18?”\n\t\t\n\t\t난 차분하게 금고 다이얼을 손에 올린다. 앞에 두 자리를 입력해 본다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_1_2 = new Story(StringsKt.trimIndent("\n\t\t“예? 부품이요? 기껏 들어와서 한다는 말이 부품 찾는다는 겁니까?\n\t\t그런 거 없으니 빨리 나가 주세요. 안 그래도 바쁜데..”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_2 = new Story(StringsKt.trimIndent("\n\t\t인파에 파묻힌 채 힘겹게 위로 손을 뻗어 일과고 학생증을 보여주자 멀리서 경찰이 날 확인하고 다급하게 손짓한다. \n\t\t\n\t\t“일과고 학생? 빨리, 빨리 들어오세요! 잠시만요!”\n\t\t\n\t\t다른 사람 들의 원성 섞인 아우성을 뒤로 한 채 경찰의 안내를 받으며 힘겹게 경찰서 안으로 들어온다.\n\t\t얼굴색이 새파랗게 질린 경찰이 한숨을 내쉰다.\n\t\t\n\t\t“대한민국 최고의 과학고등학교인 일과고 학생이 여긴 웬일인가요?”\n\t\t\n\t\t“부품이 있나 확인하러 왔ᄂ..”\n\t\t\n\t\t그 순간 안쪽에서 경찰 둘이 큰 소리 로 다급하게 대화를 나누는 것이 들린다.\n\t\t\n\t\t“아주 자랑이다. 병원에서는 폭동으로 사람이 죽어 나가는데 서장님이랑 연락도 안 되고, 이젠 무기고 번호도 몰라서 총도 못 꺼내?!”\n\t\t\n\t\t나이 많은 경찰이 자신보다 한참 후배로 보이는 경찰에게 다그친다.\n\t\t\n\t\t“아녜요, 할 수 있어요. 그때 서장님 이 일과고가 설립된 연도라 했다니까요?”\n\t\t\n\t\t후배 경찰이 쪼그려 앉아 금고 다이얼을 열심히 돌리고 있다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_1_1_repeat = new Story(StringsKt.trimIndent("\n\t\t“할 수 있으시겠어요? 그거 네 자리 비밀번호인데, 거기 총이 들어 있거든요.”\n\t\t\n\t\t나이 많은 경찰관이 도움이 절실한지 나에게 달려와 금고로 안내해준다.\n\t\t\n\t\t“저 녀석 말로는 무슨 연도라고 하니까 뭐.. 앞 두 자리는 19? 20? 아니면 혹시 18?”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_code_18 = new Story(" 금고에 입력을 계속한다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_code_19 = new Story("금고에 입력을 계속한다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_code_20 = new Story("금고에 입력을 계속한다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_code_failed = new Story("금고는 아무런 반응이 없다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_code_success = new Story(StringsKt.trimIndent("\n\t\t‘딸깍’ 하는 소리와 함께 금고가 열린다. \n\t\t나는 주변을 슬쩍 둘러본 뒤 경찰관들이 초조한 표정으로 다른 곳에 서 있는 것을 보고 몰래 품 안에 권총 한 자루를 숨긴다.\n\t\t요새 경찰들에게 지급되는 권총이 이렇게 가벼웠나?\n\t\t\n\t\t“열렸어요.” \n\t\t\n\t\t내가 아무렇지 않다는 듯이 열린 금고를 보여주자 그들의 얼굴이 밝아진다. \n\t\t\n\t\t“이런, 정말 영리한 학생이로군요. 고마워요. 다들 장비 챙겨!”\n\t\t\n\t\t경찰들이 금고 앞으로 우르르 몰려오고 나는 슬쩍 품에 숨긴 권총을 꼭 쥔 채 자리를 비켜준다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        police_move = new Story("다른 곳으로 간다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_1 = new Story(StringsKt.trimIndent("\n\t\t“저기 혹시 부품 보셨..”\n\t\t\n\t\t내가 아저씨를 가로막고 말을 걸자 그가 얼굴을 한껏 찡그 리며 성을 낸다.\n\t\t \n\t\t“뭐야! 이럴 시간 없어, 비켜! 빨리 더 챙겨야 해. 애들이 기다린다고. 잠깐, 뭐라고? 부품..? 그거라면 본 것 같아.”\n\t\t\n\t\t아저씨가 주변을 살피다가 긴박함 섞인 탄식소리를 내더니 내게 내뱉는다.\n\t\t\n\t\t“지금 이럴 게 아니고 약통을 챙겨야 하는데! 자네가 약통을 가져오면 알려줄게.”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_1_1 = new Story(StringsKt.trimIndent("\n\t\t“아, 정말 고마워! 이리로 와 봐.”\n\t\t\n\t\t아저씨가 카트를 몰고 나를 안내한다.\n\t\t\n\t\t“이 방향으로 쭉.”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_1_1_1 = new Story(StringsKt.trimIndent("\n\t\t“부폰, 최고의 골키퍼가 된 과정.”\n\t\t\n\t\t그가 가리킨 서적 코너에는 한국에 새로 들어온 베스트셀러를 홍보하고 있는 부폰의 등신대가 보인다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_return = new Story("마트를 다시 살펴본다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_2 = new Story("내가 가까이 다가가도 아이는 울음을 그치지 않고 서럽게 운다. 부모님을 잃어버린 것 같다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_2_1 = new Story(StringsKt.trimIndent("\n\t\t아이에게 초콜릿을 건네주자 아이가 울음을 뚝 그친다. \n\t\t역시 애는 애인가 보다. \n\t\t마지막으로 엄마를 본 곳이 어디냐고 물어보니 훌쩍이며 불 꺼진 수산물 코너를 가리킨다. \n\t\t아이 손을 잡고 매섭게 달려오는 카트들을 피하며 조심스럽게 그쪽으로 걸어가자 얼마 지나지 않아 아이의 부모로 보이는 사람들이 아이를 알아보고 뛰어온다. \n\t\t\n\t\t“감사해요!”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_2_1_1 = new Story(StringsKt.trimIndent("\n\t\t나는 지푸라기라도 잡는 심정으로 물어보았지만, 이내 고개를 절레절레 젓는다.\n\t\t\n\t\t“미안해요. 그런 건 듣지도 보지도 못 했어요. 근데 부품 찾는 거, 더 서두르셔야 할거에요.”\n\t\t\n\t\t아이의 엄마가 걱정스러운 표정을 지으며 말한다.\n\t\t\n\t\t“오후 6시 피난 차량 때문에요? 이미 알고 있습니다.”\n\t\t\n\t\t내가 그렇게 말하고 자리를 뜨려고 하자 그녀가 날 붙잡는다.\n\t\t\n\t\t“아니요. 학생은 순진하군요. 오히려 이런 때에 정부를 믿는 것은 바보 짓이에요. \n\t\t경찰들도, 군인들도 지금 이 상황을 모르는데 어떻게 믿고 따라갈 수 있겠어요? \n\t\t상황은 급속도로 악화될 거고, 경찰들마저 동네를 떠나버리면 혼란과 폭력만이 동네에 남을 텐데 \n\t\t제대로 된 정부가 그런 결정을 내렸을 리가 없어요.” \n\t\t\n\t\t그녀가 눈에 힘을 주어 말한다. \n\t\t\n\t\t“상황이 안정될 때까지 승학산으로 같이 피해 있기로 한 사람들이 있어요. \n\t\t6시까지 병원 옥상으로 와요. 우리와 함께 가요.”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_2_2 = new Story("아이와 눈을 맞추고 최대한 말을 걸며 달래 보려 하지만 아이는 날 보고 더 크게 울음을 터뜨린다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        market_3 = new Story("식료품들은 거의 다 털렸다. 육포 쪼가리 하나만 겨우 건졌다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        String str = "어디로 갈까?";
        market_move = new Story(str, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        house_1 = new Story("집 안은 내가 나설 때와 그대로다. 부모님은 어디로 가셨는지 행방을 알 수 없다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        house_1_2 = new Story("냉장고에 별로 먹을 게 없다. 기껏해야 냉동만두와 초콜릿. 당이 떨어질 것을 우려해 초콜릿을 챙기면 어떨까?", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        house_1_3 = new Story("서랍을 열어보니 나무 냄새가 확 난다. 그 속에는 각종 의약품들이 들어 있다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        house_1_4 = new Story("책가방에는 어제 기숙사에서 주문해 먹었던 치킨 냄새와 책 냄새가 섞여 있다. 그 속에는 학생증이 들어있다.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        house_move = new Story(str, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        gas_station_1 = new Story(StringsKt.trimIndent("\n\t\t주인 없는 큰 개 한 마리가 겁에 질렸는지 꼬리를 바싹 내린 채 아수라장 속을 돌아 다니고 있다. \n\t\t가까이 다가가려 하자 나를 경계하는지 눈치를 슥 보더니 잰걸음으로 총총총 도망친다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        gas_station_1_1 = new Story(StringsKt.trimIndent("\n\t\t팔을 뻗어 녀석의 주둥이 앞에 대고 육포를 살랑살랑 흔들자 녀석이 가까이 다가온다. \n\t\t목덜미를 쓰다듬으며 육포를 주자 맛있게 먹는다. \n\t\t이 놈도 의지할 사람이 필요했던 것인지, 나를 졸졸 따라오기 시작한다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        gas_station_2 = new Story(StringsKt.trimIndent("\n\t\t\"캠핑을 가다가 우리 애가 고열 때문에 갑자기 정신을 잃었어요! \n\t\t병원에 데려가야 하 는데 그때까지 무사할 지 모르겠어요. \n\t\t듣자하니 병원에 무슨 사고가 있다던데, 병원에 데려가 는 것이 맞는지도 모르겠고..“\n\t\t\n\t\t선캡을 쓴 여자가 다급하게 소리친다.\n\t\t\n\t\t”학생, 제발 도와주세요. 만에 하나 저희 애가 혹시 잘못되기라도 한다면 저는 정말 무슨 선택을 할지 몰라요...“\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        gas_station_2_1 = new Story(StringsKt.trimIndent("\n\t\t내가 약통을 건네자 선캡을 쓴 아줌마는 호들갑을 떨며 감사의 인사를 한다. \n\t\t그리고 약통에서 필요한 약을 찾아 아이에게 먹인다.\n\t\t\n\t\t“정말 감사합니다! 학생, 꼭 살아남길 기도할 게요..”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        gas_station_move = new Story(str, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1 = new Story(StringsKt.trimIndent("\n\t\t안으로 들어갈 방법을 찾기 위해 몸을 최대한 숨기면서 병원 둘레를 빙 돌아본다. \n\t\t자세히 보니 병원 현관은 놈들 다수가 지키고 있지만 응급차가 드나드는 차고에는 보초가 단 한 명만 있다는 점이다. \n\t\t보초의 키는 무척 크지만 그의 얼굴에 지친 기색이 역력한 것으로 보아 이 대담한 병원 점거를 그다지 원치 않았던 것 같아 보인다. \n\t\t어디, 주짓수 실력 좀 보여줄까?\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_failed = new Story(StringsKt.trimIndent("\n\t\t주유소에서 봤던 선캡을 쓴 아줌마가 아기를 데리고 여기저기 휘저으며 난동을 피우고 있다. \n\t\t도저히 앞으로 나아갈 수 없다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1 = new Story(StringsKt.trimIndent("\n\t\t나는 그가 잠시 주머니에서 담배를 꺼내려고 머리를 숙인 틈을 타 기습한다. \n\t\t그는 갑작스러운 기습에 당황하여 소리를 지르려 하지만 가볍게 그의 입을 틀어막고 누른다. \n\t\t그가 바둥거리며 저항했지만 이 정도는 나에게 끄떡도 없다. \n\t\t그를 기절시킨 후 응급차 안에 대충 욱여넣고 병원 안으로 들어간다. \n\t\t복도엔 출처를 알 수 없는 핏자국이 가득하다. 엄청난 충돌이 있었던 것 같다. \n\t\t1층은 그 놈들이 점거했으니 빨리 계단으로 가야 할텐데, 몇 층으로 가야 하지?\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_2F = new Story("2층이다. 부품이 여기에 있을까?", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_201 = new Story(StringsKt.trimIndent("\n\t\t201호 병실에 들어간다. 아무도 없다. \n\t\t병실 침대와 옷가지가 이리저리 흩어져 있는 것으로 보아 누군가가 급하게 여길 떠난 것 같다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_202 = new Story(StringsKt.trimIndent("\n\t\t202호 병실에 들어간다. \n\t\t머리에 피를 잔뜩 묻힌 채 기절한 남자 하나가 바닥 에 엎어져 있다. \n\t\t바닥에 뿌려진 산산조각난 약통 파편들로 보아 약품을 지키려다가 악당들에게 변을 당한 것 같다.\n\t\t몇 번 흔들어보지만 일어날 기미가 보이지 않는다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_203 = new Story(StringsKt.trimIndent("\n\t\t203호 병실에 들어간다. \n\t\t다른 병실과 달리 정말 아무것도 없다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_3F = new Story("3층이다. 부품이 여기에 있을까?", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_301 = new Story(StringsKt.trimIndent("\n\t\t301호 병실 문틈 사이로 남자 둘이 작은 소리로 대화를 하는 모습이 보인다.\n\t\t\n\t\t“..그래서 계획은? 계획은 뭔데? 이렇게 병원만 차지하고 있으면 땡이야?”\n\t\t\n\t\t비니를 눌러 쓴 키 작은 남자가 묻자 그 옆에 선 검은 마스크를 쓴 비열하게 생긴 다른 남자가 마스크를 내린다.\n\t\t\n\t\t“그래. 지금 이 뭣도 모르는 순진한 아저씨들이랑 같이 여기만 잘 지키면 돼. \n\t\t은성인가 하는 그 사람이 생각보다 우리 의도대로 잘 움직여주고 있어. \n\t\t동네 양아치들쯤은 18시가 지난 후 경찰들이 버리고 간 무기들로 쓸어버리면 돼.”\n\t\t\n\t\t그가 킬킬댄다. 나는 그들 눈에 띄지 않게 조심스럽게 물러난다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_302 = new Story(StringsKt.trimIndent("\n\t\t302호 병실에 들어간다. 의사 한 명이 신음하며 벽에 기댄 채 힘겹게 앉아 있다.\n\t\t\n\t\t“..놈들이.. 대체.. 뭐 때문인지는 모르겠지만 약이랑 의료 물품들을 싸그리 챙기고 있어요. \n\t\t자기 가족들 말고는 다른 환자들 치료도.. 못 하게 하고..”\n\t\t\n\t\t그녀가 숨을 몰아쉬며 말을 이어나간다.\n\t\t\n\t\t“학생.. 꼭 살아남으세요..”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303 = new Story(StringsKt.trimIndent("\n\t\t303호 병실에 들어간다. 병실 침대도 없이 텅 비어 있다. \n\t\t부품은 대체 어디 있는 걸까, 하고 뒤를 돌아보려던 순간, 구석에 박혀 있는 기계 덩어리가 보인다. \n\t\t드디어 부품 을 찾았다. 사이즈도 딱 맞다. 이걸 학교로 들고 가기만 하면 된다!\n\t\t난 계단 위로 올라와 잠시 숨을 돌린다. \n\t\t그러나 제대로 쉴 틈도 없이 복도 끝에서 검은 마스크를 한 남자 하나가 나를 보고 소리친다.\n\t\t\n\t\t“수상한 놈이다! 잡아!”\n\t\t\n\t\t복도 양쪽에서 놈들이 나를 향해 달려온다. \n\t\t다 쓰러뜨리려면 한참이 걸릴 것 같다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_4F = new Story("4층이다. 부품이 여기에 있을까?", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_401 = new Story(StringsKt.trimIndent("\n\t\t401호 병실에 들어간다. \n\t\t환자복을 입은 어딘가 모자라보이는 남자 하나가 멀뚱멀뚱 나를 쳐다보고 있다.\n\t\t\n\t\t“학생! 혹시 밖에서 왔어? 깨어나니까 병원은 이 지경이 되어 있고, \n\t\t밖으로 나가려니까 무서운 형들이 못 나가게 하더라고. \n\t\t할머니가 피자 사서 병문안 오기 로 했는데 괜찮은지 모르겠네. \n\t\t하도 오지랖이 넓어서 뭔 일이 났을지도 몰라.”\n\t\t\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_401_1 = new Story("우와, 정말? 고마워. 초콜릿은 잘 먹을게. 어? 뭐 주는 거 없냐고? 지금 나한테 그런게 어딨어.", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_1_403 = new Story(StringsKt.trimIndent("\n\t\t403호 병실에 들어간다. \n\t\t아무도 없지만 침대마다 핏자국이 가득하다. \n\t\t그 밖에 단서가 될만한 것은 보이지 않는다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_1_2 = new Story(StringsKt.trimIndent("\n\t\t내가 권총을 겨누자 그는 몹시 당황하며 뒤로 물러난다.\n\t\t\n\t\t“이런, 어린 녀석이 총은 어디서 난 거야? 들어갈 거면 빨리 들어가. 들키면 내가 호되게 맞으니까.”\n\t\t\n\t\t나는 그에게 총을 겨눈 채 조심스럽게 병원 안으로 들어간다. \n\t\t놈들이 언제 몰려와 뒤를 칠지 모르니 빨리 찾아야 한다. \n\t\t\n\t\t몇 층으로 가야 하지? 부품은 어딨지?\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_2 = new Story(StringsKt.trimIndent("\n\t\t달려오는 놈들에게 권총을 꺼내 겨눈다. \n\t\t선두에서 달려오던 놈들이 주춤한다.\n\t\t\n\t\t“젠장! 고작 고등학생이 권총을 들고 있는 게 말이 돼?”\n\t\t\n\t\t총을 겨눈 채로 눈짓과 손짓으로 그들을 병실 안으로 몰아넣는다. \n\t\t밖에서 대충 문을 걸어 잠근 나는 재빨리 계단 위로 뛰어올라간다. \n\t\t근데 갑자기 병원 입구에서 봤던 러닝셔츠가 혼자 성난 얼굴로 나를 쫓아오는 것이 보인다. \n\t\t\n\t\t“거의 다 잡았다!”\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_2_2 = new Story(StringsKt.trimIndent("\n\t\t나는 돌아서서 총을 쏘려고 권총을 꺼내 재빨리 겨눈다. \n\t\t그가 음흉한 표정을 지으며 웃는다.\n\t\t\n\t\t“쏠 수 있으면 쏴 보시지. 어딜 고딩이 총을 겨눠?” \n\t\t\n\t\t위협은 전혀 통하지 않는 것 같다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_2_2_1 = new Story(StringsKt.trimIndent("\n\t\t그렇다. \n\t\t내가 총을 갖고 방아쇠를 당겨본 기억으로는 사격장과 배틀그라운드밖에 없다. \n\t\t용기를 내서 방아쇠를 당겼지만 어쩐지 가벼웠던 총은 틱틱 소리만 낼 뿐 아무리 방아쇠를 당겨도 발사되지 않는다. \n\t\t러닝셔츠가 손뼉을 치며 웃는다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_Fight = new Story(StringsKt.trimIndent("\n\t\t결국 육체 싸움을 할 수 밖에 없다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_2_3 = new Story(StringsKt.trimIndent("\n\t\t그 순간, 나의 친해진 지 1시간도 채 되지 않은 충견이 뒤에서 펄쩍 뛰어올라 러닝셔츠의 목덜미를 문다.\n\t\t\n\t\t“뭐, 뭐야! 개, 개잖아! 개다!!!”\n\t\t\n\t\t그는 발작하듯 몸부림치며 온몸을 휘젓는다. \n\t\t나의 개가 사납게 짖으며 그의 정신을 쏙 빼놓는 사이 \n\t\t내가 다가가 그의 얼 굴에 힘을 가득 실은 최후의 한 방을 날린다. \n\t\t충격이 상당했는지 그는 바닥에 축 늘어진다. \n\t\t개의 머리를 쓰다듬어준다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_2_3_1 = new Story(StringsKt.trimIndent("\n\t\t아까 아이 엄마가 뭐라고 하셨지? \n\t\t병원 옥상으로 올라오랬지. \n\t\t시간이 얼마 남지 않았다. 빨리 올라가자!\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        hospital_303_2_3_2 = new Story(StringsKt.trimIndent("\n\t\t젠장, 시간이 없는데 이제 어쩌지?\n\t\t\n\t\t잠깐, 사람들이 급히 뛰는 발소리가 들린다.\n\t\t병원 옥상으로 향하는 듯 하다.\n\t\t\n\t\t나쁜 이들은 아닌 것 같으니 따라 가 보는 것이 좋겠다.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        game_over = new Story(StringsKt.trimIndent("\n\t\t그 순간, 시끄러운 사이렌 소리와 함께 사방에서 뭐라고 외치는 소리가 들린다. \n\t\t차체 곳곳에 살벌하게 생긴 장갑을 덧댄 한 무리의 검은 차들이 한 줄로 빠르게 동네를 빠져나가는 것이 저 멀리에 보인다. \n\t\t아뿔싸. 벌써 1시간이 지났구나. \n\t\t\n\t\t차들이 떠나가자 사방에서 기분 나쁜 함성 소리와 야유 소리가 들린다. \n\t\t거듭되는 폭발음과 비명 소리.. 도시엔 진정한 혼란이 찾아오고 있다. \n\t\t\n\t\t나는 학교를 구해내지 못했다.\n\t\t1시간은 빠듯했다.. 단서를 찾고 계획을 세워야 한다. \n\t\t다시 한 시간 전으로 돌아갈 수만 있다면.\n\t"), 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        game_ending = MapsKt.mapOf(TuplesKt.to("게임오버", game_over), TuplesKt.to("굿엔딩", game_ending_1), TuplesKt.to("배드엔딩", game_ending_2));
        start.set("롤을 한 판 더 한다. (30분)", new Prob.TimePass(30), (Prob) null, start_1);
        start.set("밖으로 나가 본다.", (Prob) null, (Prob) null, start_2);
        start_1.set("일어난다.", (Prob) null, (Prob) null, start);
        start_2.set("계속", (Prob) null, (Prob) null, rotary);
        rotary.set("오후 6시.. 1시간 안에 뭐라도 해야한다!", (Prob) null, (Prob) null, rotary_1);
        rotary_1.set("어서 빨리 찾아보자!", (Prob) null, (Prob) null, rotary_1_1);
        rotary_1_1.set("주위를 둘러본다.", (Prob) null, (Prob) null, rotary_1_1_1);
        rotary_1_1.set("다른 곳으로 가보자.", (Prob) null, (Prob) null, rotary_1_1_2);
        rotary_1_1_1.set("\"하하.. 전 할 게 좀 많아서요. 다음에 뵙겠습니다.\"", (Prob) null, (Prob) null, rotary_1_1_1_next);
        rotary_1_1_1_next.set("다른 곳으로 가보자.", (Prob) null, (Prob) null, rotary_1_1_2);
        rotary_1_1_2.set("학교로 가자. (8분)", new Prob.TimePass(8), (Prob) null, school);
        rotary_1_1_2.set("경찰서로 가자. (9분)", new Prob.TimePass(9), (Prob) null, police);
        rotary_1_1_2.set("집으로 가자. (2분)", new Prob.TimePass(2), (Prob) null, house);
        school.set("다른 곳으로 가보자.", (Prob) null, (Prob) null, school_move);
        school_move.set("로터리로 가자. (8분)", new Prob.TimePass(8), (Prob) null, rotary);
        school_move.set("주유소로 가자. (7분)", new Prob.TimePass(7), (Prob) null, gas_station);
        police.set("인파를 헤치고 들어간다. (10분)", new Prob.TimePass(10), new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isProbExist(new Prob.Normal("권총"));
            }
        }, 1, null), police_1);
        police.set("\"일과고 학생입니다.\" (학생증 필요)", (Prob) null, new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return it.isProbExist(new Prob.Normal("학생증")) & (!it.isProbExist(new Prob.Normal("권총")));
            }
        }, 1, null), police_2);
        police.set("다른 곳으로 간다.", (Prob) null, (Prob) null, police_move);
        police_move.set("로터리로 간다. (9분)", new Prob.TimePass(9), (Prob) null, rotary);
        police_move.set("마트로 간다. (5분)", new Prob.TimePass(5), (Prob) null, market);
        police_move.set("주유소로 간다. (6분)", new Prob.TimePass(6), (Prob) null, gas_station);
        police_1.set("\"제가 풀어볼게요.\"", (Prob) null, (Prob) null, police_1_1);
        police_1.set("\"부품 보신 적 있나요?\"\"", (Prob) null, (Prob) null, police_1_2);
        police_1.set("다른 곳으로 간다.", (Prob) null, (Prob) null, police_move);
        police_1_1.set("18", (Prob) null, (Prob) null, police_code_18);
        police_1_1.set("19", (Prob) null, (Prob) null, police_code_19);
        police_1_1.set("20", (Prob) null, (Prob) null, police_code_20);
        police_code_18.set("97", (Prob) null, (Prob) null, police_code_failed);
        police_code_18.set("98", (Prob) null, (Prob) null, police_code_failed);
        police_code_18.set("99", (Prob) null, (Prob) null, police_code_failed);
        police_code_19.set("97", (Prob) null, (Prob) null, police_code_failed);
        police_code_19.set("98", (Prob) null, (Prob) null, police_code_failed);
        police_code_19.set("99", (Prob) null, (Prob) null, police_code_failed);
        police_code_20.set("10", (Prob) null, (Prob) null, police_code_failed);
        police_code_20.set("11", (Prob) null, (Prob) null, police_code_failed);
        police_code_20.set("12", new Prob.Normal("권총"), (Prob) null, police_code_success);
        police_code_failed.set("다시 도전한다.", (Prob) null, (Prob) null, police_1_1_repeat);
        police_1_1_repeat.set("18", (Prob) null, (Prob) null, police_code_18);
        police_1_1_repeat.set("19", (Prob) null, (Prob) null, police_code_19);
        police_1_1_repeat.set("20", (Prob) null, (Prob) null, police_code_20);
        police_code_failed.set("다른 곳으로 간다.", (Prob) null, (Prob) null, police_move);
        police_code_success.set("다른 곳으로 간다.", (Prob) null, (Prob) null, police_move);
        police_1_2.set("다른 곳으로 간다.", (Prob) null, (Prob) null, police_move);
        police_2.set("\"제가 풀어볼게요.\"", (Prob) null, (Prob) null, police_1_1);
        police_2.set("\"부품 보신 적 있나요?\"", (Prob) null, (Prob) null, police_1_2);
        police_2.set("다른 곳으로 간다.", (Prob) null, (Prob) null, police_move);
        market.set("아저씨에게 가 본다.", (Prob) null, (Prob) null, market_1);
        market.set("우는 아이에게 가 본다.", (Prob) null, new Prob.OptionPassed("아이 엄마"), market_2);
        market.set("먹을 것을 찾아본다.", (Prob) null, new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isProbExist(new Prob.Disposable("육포"));
            }
        }, 1, null), market_3);
        market.set("다른 곳으로 간다.", (Prob) null, (Prob) null, market_move);
        market_move.set("경찰서로 간다. (5분)", new Prob.TimePass(5), (Prob) null, police);
        market_move.set("집으로 간다. (2분)", new Prob.TimePass(2), (Prob) null, house);
        market_move.set("병원으로 간다. (8분)", new Prob.TimePass(8), (Prob) null, hospital);
        market_1.set("\"여기 있어요. (의약품 필요)\"", (Prob) null, (Prob) null, market_1_1);
        market_1.set("마트에서 약을 찾는다. (10분)", new Prob.TimePass(10), (Prob) null, market_1_1);
        market_1.set("\"됐어요.\"", (Prob) null, (Prob) null, market);
        market_1_1.set("간다.", (Prob) null, (Prob) null, market_1_1_1);
        market_1_1_1.set("마트를 다시 살펴본다.", (Prob) null, (Prob) null, market);
        market_2.set("초콜릿을 준다. (초콜릿 필요)", (Prob) null, new Prob.Disposable("초콜릿"), market_2_1);
        market_2.set("달래준다. (3분)", new Prob.TimePass(3), (Prob) null, market_2_2);
        market_2_1.set("\"혹시 부품 보셨나요?\"", new Prob.OptionPassed("아이 엄마"), (Prob) null, market_2_1_1);
        market_2_1_1.set("\"네. 알겠습니다. 일단 부품부터 찾고요.\"", (Prob) null, (Prob) null, market);
        market_2_2.set("포기한다.", (Prob) null, (Prob) null, market);
        market_2_2.set("계속 달래준다. (3분)", new Prob.TimePass(3), (Prob) null, market_2_2);
        market_3.set("돌아가기", new Prob.Disposable("육포"), (Prob) null, market);
        house.set("집 안으로 들어간다.", (Prob) null, (Prob) null, house_1);
        house.set("다른 곳으로 간다.", (Prob) null, (Prob) null, house_move);
        house_move.set("로터리로 간다. (6분)", new Prob.TimePass(6), (Prob) null, rotary);
        house_move.set("마트로 간다. (2분)", new Prob.TimePass(2), (Prob) null, market);
        house_1.set("집 밖으로 나간다.", (Prob) null, (Prob) null, house_move);
        house_1.set("냉장고를 열어 본다.", (Prob) null, new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isProbExist(new Prob.Disposable("초콜릿"));
            }
        }, 1, null), house_1_2);
        house_1.set("서랍을 뒤져 본다.", (Prob) null, new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isProbExist(new Prob.Disposable("의약품"));
            }
        }, 1, null), house_1_3);
        house_1.set("책가방을 뒤져 본다.", (Prob) null, new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.6
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isProbExist(new Prob.Normal("학생증"));
            }
        }, 1, null), house_1_4);
        house_1_2.set("초콜릿을 챙긴다.", new Prob.Disposable("초콜릿"), (Prob) null, house_1);
        house_1_2.set("그냥 놔두고 온다.", (Prob) null, (Prob) null, house_1);
        house_1_3.set("의약품을 챙긴다.", new Prob.Disposable("의약품"), (Prob) null, house_1);
        house_1_3.set("그냥 놔두고 온다.", (Prob) null, (Prob) null, house_1);
        house_1_4.set("학생증을 챙긴다.", new Prob.Normal("학생증"), (Prob) null, house_1);
        house_1_4.set("그냥 내버려두고고 온다.", (Prob) null, (Prob) null, house_1);
        gas_station.set("개에게 다가간다.", (Prob) null, new Prob.Condition(false, new Function1<Player, Boolean>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Player player) {
                return Boolean.valueOf(invoke2(player));
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                return !it.isProbExist(new Prob.Normal("개"));
            }
        }), gas_station_1);
        gas_station.set("차에 탄 여자에게 가 본다.", (Prob) null, new Prob.OptionPassed("아줌마"), gas_station_2);
        gas_station.set("다른 곳으로 간다.", (Prob) null, (Prob) null, gas_station_move);
        gas_station_move.set("학교로 간다. (7분)", new Prob.TimePass(7), (Prob) null, school);
        gas_station_move.set("경찰서로 간다.(6분)", new Prob.TimePass(6), (Prob) null, police);
        gas_station_move.set("병원으로 간다. (6분)", new Prob.TimePass(6), (Prob) null, hospital);
        gas_station_1.set("육포로 유인한다. (육포 필요)", new Prob.Normal("개"), new Prob.Disposable("육포"), gas_station_1_1);
        gas_station_1.set("주유소를 더 살펴본다.", (Prob) null, (Prob) null, gas_station);
        gas_station_1.set("주유소를 빠져나온다.", (Prob) null, (Prob) null, gas_station_move);
        gas_station_1_1.set("주유소를 더 살펴본다.", (Prob) null, (Prob) null, gas_station);
        gas_station_2.set("약을 준다. (의약품 필요)", new Prob.OptionPassed("아줌마"), new Prob.Disposable("의약품"), gas_station_2_1);
        gas_station_2.set("돌아가 주유소를 살펴본다.", (Prob) null, (Prob) null, gas_station);
        gas_station_2.set("주유소를 빠져나온다.", (Prob) null, (Prob) null, gas_station_move);
        gas_station_2_1.set("주유소를 더 살펴본다.", (Prob) null, (Prob) null, gas_station);
        hospital.set("주변을 돌아본다. (10분)", new Prob.TimePass(10), (Prob) null, new Function1<Player, Story>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.8
            @Override // kotlin.jvm.functions.Function1
            public final Story invoke(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                if (it.isProbExist(new Prob.OptionPassed("아줌마"))) {
                    return StoryLine.access$getHospital_1_failed$p(StoryLine.INSTANCE);
                }
                return StoryLine.access$getHospital_1$p(StoryLine.INSTANCE);
            }
        });
        hospital_1_failed.set("주유소로 간다. (6분)", new Prob.TimePass(6), (Prob) null, gas_station);
        hospital_1_failed.set("마트로 간다. (8분)", new Prob.TimePass(8), (Prob) null, market);
        hospital.set("주유소로 간다. (6분)", new Prob.TimePass(6), (Prob) null, gas_station);
        hospital.set("마트로 간다. (8분)", new Prob.TimePass(8), (Prob) null, market);
        hospital_1.set("제압한다. (15분)", new Prob.TimePass(15), (Prob) null, hospital_1_1);
        hospital_1.set("권총으로 위협한다. (권총 필요)", (Prob) null, new Prob.Normal("권총"), hospital_1_2);
        hospital_1_1.set("2층", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1.set("3층", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1.set("4층", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_2F.set("201호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_201);
        hospital_1_1_2F.set("202호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_202);
        hospital_1_1_2F.set("203호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_203);
        hospital_1_1_201.set("2층을 마저 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1_201.set("3층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1_201.set("4층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_202.set("2층을 마저 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1_202.set("3층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1_202.set("4층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_203.set("2층을 마저 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1_203.set("3층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1_203.set("4층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_3F.set("301호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_301);
        hospital_1_1_3F.set("302호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_302);
        hospital_1_1_3F.set("303호로 들어간다.", (Prob) null, (Prob) null, hospital_303);
        hospital_1_1_301.set("2층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1_301.set("3층을 마저 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1_301.set("4층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_302.set("2층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1_302.set("3층을 마저 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1_302.set("4층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_4F.set("401호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_401);
        hospital_1_1_4F.set("402호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_403);
        hospital_1_1_4F.set("403호로 들어간다.", (Prob) null, (Prob) null, hospital_1_1_403);
        hospital_1_1_401.set("\"할머니는 잘 계셔. (초콜릿 필요)\"", (Prob) null, new Prob.Disposable("초콜릿"), hospital_1_1_401_1);
        hospital_1_1_401.set("밖으로 나온다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_401_1.set("밖으로 나온다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_1_403.set("2층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_1_403.set("3층을 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_1_403.set("4층을 마저 살펴본다.", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_1_2.set("2층", (Prob) null, (Prob) null, hospital_1_1_2F);
        hospital_1_2.set("3층", (Prob) null, (Prob) null, hospital_1_1_3F);
        hospital_1_2.set("4층", (Prob) null, (Prob) null, hospital_1_1_4F);
        hospital_303.set("싸운다. (20분)", new Prob.TimePass(20), (Prob) null, hospital_303_Fight);
        hospital_303.set("무기를 꺼낸다. (권총 필요)", new Prob.TimePass(0), new Prob.Normal("권총"), hospital_303_2);
        hospital_303_2.set("싸운다. (20분)", new Prob.TimePass(20), (Prob) null, hospital_303_Fight);
        hospital_303_2.set("총을 쏜다. (권총 필요)", (Prob) null, (Prob) null, hospital_303_2_2);
        hospital_303_2_2.set("쏜다. (권총 필요)", (Prob) null, (Prob) null, hospital_303_2_2_1);
        hospital_303_2_2.set("싸운다. (20분)", new Prob.TimePass(20), (Prob) null, hospital_303_Fight);
        hospital_303_2.set("\"물어! (개 필요)\"", (Prob) null, (Prob) null, hospital_303_2_3);
        hospital_303_2_3.set("다음", new Prob.TimePass(0), (Prob) null, new Function1<Player, Story>() { // from class: kr.hs.bsis.helloworld08.bsis2033.StoryLine.9
            @Override // kotlin.jvm.functions.Function1
            public final Story invoke(Player it) {
                Intrinsics.checkParameterIsNotNull(it, "it");
                if (it.isProbExist(new Prob.OptionPassed("아이 엄마"))) {
                    return StoryLine.access$getHospital_303_2_3_2$p(StoryLine.INSTANCE);
                }
                return StoryLine.access$getHospital_303_2_3_1$p(StoryLine.INSTANCE);
            }
        });
        hospital_303_2_3_1.set("올라간다.", new Prob.TimePass(2), (Prob) null, game_ending_1);
        hospital_303_2_3_2.set("올라간다.", new Prob.TimePass(3), (Prob) null, game_ending_2);
    }

    private StoryLine() {
    }

    public static final /* synthetic */ Story access$getHospital_1$p(StoryLine storyLine) {
        return hospital_1;
    }

    public static final /* synthetic */ Story access$getHospital_1_failed$p(StoryLine storyLine) {
        return hospital_1_failed;
    }

    public static final /* synthetic */ Story access$getHospital_303_2_3_1$p(StoryLine storyLine) {
        return hospital_303_2_3_1;
    }

    public static final /* synthetic */ Story access$getHospital_303_2_3_2$p(StoryLine storyLine) {
        return hospital_303_2_3_2;
    }

    public final Story getStart() {
        return start;
    }

    public final Map<String, Story> getGame_ending() {
        return game_ending;
    }
}
