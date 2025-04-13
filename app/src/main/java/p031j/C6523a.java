package p031j;

import android.view.ViewGroup;
import androidx.preference.Preference;
import com.airbnb.epoxy.EpoxyModel;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.vote.ProfileReleaseVoteUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.related.RelatedUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseCollectionsUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.search.SearchUiController;
import com.swiftsoft.anixartd.p015ui.controller.main.streaming.ReleaseStreamingPlatformUiController;
import com.swiftsoft.anixartd.p015ui.fragment.main.preference.ProfilePreferenceFragment;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnDonate;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.view2.DivImagePreloader;
import com.yandex.div.histogram.HistogramFilter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.widget.tabs.DynamicCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.MaxCardHeightCalculator;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div2.DivTemplate;
import com.yandex.metrica.YandexMetrica;
import kotlin.reflect.KProperty;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* renamed from: j.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6523a implements EpoxyModel.SpanSizeOverrideCallback, Preference.OnPreferenceClickListener, DivPreloader.Callback, DivViewConfig, DivImagePreloader.Callback, HeightCalculatorFactory, TemplateParsingEnvironment.TemplateFactory, Cancelable, HistogramFilter {

    /* renamed from: b */
    public final /* synthetic */ int f63036b;

    /* renamed from: c */
    public static final /* synthetic */ C6523a f63012c = new C6523a(0);

    /* renamed from: d */
    public static final /* synthetic */ C6523a f63013d = new C6523a(1);

    /* renamed from: e */
    public static final /* synthetic */ C6523a f63014e = new C6523a(2);

    /* renamed from: f */
    public static final /* synthetic */ C6523a f63015f = new C6523a(3);

    /* renamed from: g */
    public static final /* synthetic */ C6523a f63016g = new C6523a(4);

    /* renamed from: h */
    public static final /* synthetic */ C6523a f63017h = new C6523a(5);

    /* renamed from: i */
    public static final /* synthetic */ C6523a f63018i = new C6523a(6);

    /* renamed from: j */
    public static final /* synthetic */ C6523a f63019j = new C6523a(7);

    /* renamed from: k */
    public static final /* synthetic */ C6523a f63020k = new C6523a(8);

    /* renamed from: l */
    public static final /* synthetic */ C6523a f63021l = new C6523a(9);

    /* renamed from: m */
    public static final /* synthetic */ C6523a f63022m = new C6523a(10);

    /* renamed from: n */
    public static final /* synthetic */ C6523a f63023n = new C6523a(11);

    /* renamed from: o */
    public static final /* synthetic */ C6523a f63024o = new C6523a(12);

    /* renamed from: p */
    public static final /* synthetic */ C6523a f63025p = new C6523a(13);

    /* renamed from: q */
    public static final /* synthetic */ C6523a f63026q = new C6523a(14);

    /* renamed from: r */
    public static final /* synthetic */ C6523a f63027r = new C6523a(15);

    /* renamed from: s */
    public static final /* synthetic */ C6523a f63028s = new C6523a(16);

    /* renamed from: t */
    public static final /* synthetic */ C6523a f63029t = new C6523a(17);

    /* renamed from: u */
    public static final /* synthetic */ C6523a f63030u = new C6523a(18);

    /* renamed from: v */
    public static final /* synthetic */ C6523a f63031v = new C6523a(19);

    /* renamed from: w */
    public static final /* synthetic */ C6523a f63032w = new C6523a(20);

    /* renamed from: x */
    public static final /* synthetic */ C6523a f63033x = new C6523a(21);

    /* renamed from: y */
    public static final /* synthetic */ C6523a f63034y = new C6523a(22);

    /* renamed from: z */
    public static final /* synthetic */ C6523a f63035z = new C6523a(23);

    /* renamed from: A */
    public static final /* synthetic */ C6523a f63006A = new C6523a(24);

    /* renamed from: B */
    public static final /* synthetic */ C6523a f63007B = new C6523a(25);

    /* renamed from: C */
    public static final /* synthetic */ C6523a f63008C = new C6523a(26);

    /* renamed from: D */
    public static final /* synthetic */ C6523a f63009D = new C6523a(27);

    /* renamed from: E */
    public static final /* synthetic */ C6523a f63010E = new C6523a(28);

    /* renamed from: F */
    public static final /* synthetic */ C6523a f63011F = new C6523a(29);

    public /* synthetic */ C6523a(int i2) {
        this.f63036b = i2;
    }

    @Override // com.yandex.div.histogram.HistogramFilter
    /* renamed from: a */
    public boolean mo17293a(String str) {
        switch (this.f63036b) {
            case 28:
                HistogramFilter.Companion companion = HistogramFilter.Companion.f33684a;
                return true;
            default:
                HistogramFilter.Companion companion2 = HistogramFilter.Companion.f33684a;
                return false;
        }
    }

    @Override // com.yandex.div.internal.widget.tabs.HeightCalculatorFactory
    /* renamed from: b */
    public ViewPagerFixedSizeLayout.HeightCalculator mo17504b(ViewGroup viewGroup, HeightCalculatorFactory.MeasureTabHeightFn measureTabHeightFn, HeightCalculatorFactory.GetTabCountFn getTabCountFn) {
        switch (this.f63036b) {
            case 24:
                return new DynamicCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
            default:
                return new MaxCardHeightCalculator(viewGroup, measureTabHeightFn, getTabCountFn);
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    /* renamed from: c */
    public boolean mo3395c(Preference preference) {
        KProperty<Object>[] kPropertyArr = ProfilePreferenceFragment.f28361t;
        YandexMetrica.reportEvent("Переход в раздел Спонсорство");
        EventBusKt.m16327a(new OnDonate());
        return true;
    }

    @Override // com.yandex.div.histogram.util.Cancelable
    public void cancel() {
    }

    @Override // com.airbnb.epoxy.EpoxyModel.SpanSizeOverrideCallback
    /* renamed from: d */
    public int mo4530d(int i2, int i3, int i4) {
        int buildModels$lambda$3$lambda$2;
        int buildModels$lambda$5$lambda$4;
        int buildModels$lambda$1$lambda$0;
        int buildModels$lambda$2$lambda$1;
        int buildModels$lambda$1$lambda$02;
        int buildModels$lambda$3$lambda$22;
        int buildModels$lambda$6$lambda$5$lambda$4;
        int buildModels$lambda$9$lambda$8$lambda$7;
        int buildModels$lambda$11$lambda$10;
        int buildModels$lambda$13$lambda$12;
        int buildModels$lambda$20$lambda$19$lambda$18;
        int buildModels$lambda$23$lambda$22$lambda$21;
        int buildModels$lambda$1$lambda$03;
        int buildModels$lambda$5$lambda$42;
        int buildModels$lambda$7$lambda$6;
        int buildModels$lambda$9$lambda$8;
        switch (this.f63036b) {
            case 0:
                buildModels$lambda$3$lambda$2 = ProfileReleaseVoteUiController.buildModels$lambda$3$lambda$2(i2, i3, i4);
                return buildModels$lambda$3$lambda$2;
            case 1:
                buildModels$lambda$5$lambda$4 = ProfileReleaseVoteUiController.buildModels$lambda$5$lambda$4(i2, i3, i4);
                return buildModels$lambda$5$lambda$4;
            case 2:
                buildModels$lambda$1$lambda$0 = RelatedUiController.buildModels$lambda$1$lambda$0(i2, i3, i4);
                return buildModels$lambda$1$lambda$0;
            case 3:
                buildModels$lambda$2$lambda$1 = ReleaseCollectionsUiController.buildModels$lambda$2$lambda$1(i2, i3, i4);
                return buildModels$lambda$2$lambda$1;
            case 4:
                buildModels$lambda$1$lambda$02 = SearchUiController.buildModels$lambda$1$lambda$0(i2, i3, i4);
                return buildModels$lambda$1$lambda$02;
            case 5:
                buildModels$lambda$3$lambda$22 = SearchUiController.buildModels$lambda$3$lambda$2(i2, i3, i4);
                return buildModels$lambda$3$lambda$22;
            case 6:
                buildModels$lambda$6$lambda$5$lambda$4 = SearchUiController.buildModels$lambda$6$lambda$5$lambda$4(i2, i3, i4);
                return buildModels$lambda$6$lambda$5$lambda$4;
            case 7:
                buildModels$lambda$9$lambda$8$lambda$7 = SearchUiController.buildModels$lambda$9$lambda$8$lambda$7(i2, i3, i4);
                return buildModels$lambda$9$lambda$8$lambda$7;
            case 8:
                buildModels$lambda$11$lambda$10 = SearchUiController.buildModels$lambda$11$lambda$10(i2, i3, i4);
                return buildModels$lambda$11$lambda$10;
            case 9:
                buildModels$lambda$13$lambda$12 = SearchUiController.buildModels$lambda$13$lambda$12(i2, i3, i4);
                return buildModels$lambda$13$lambda$12;
            case 10:
                buildModels$lambda$20$lambda$19$lambda$18 = SearchUiController.buildModels$lambda$20$lambda$19$lambda$18(i2, i3, i4);
                return buildModels$lambda$20$lambda$19$lambda$18;
            case 11:
                buildModels$lambda$23$lambda$22$lambda$21 = SearchUiController.buildModels$lambda$23$lambda$22$lambda$21(i2, i3, i4);
                return buildModels$lambda$23$lambda$22$lambda$21;
            case 12:
                buildModels$lambda$1$lambda$03 = ReleaseStreamingPlatformUiController.buildModels$lambda$1$lambda$0(i2, i3, i4);
                return buildModels$lambda$1$lambda$03;
            case 13:
                buildModels$lambda$5$lambda$42 = ReleaseStreamingPlatformUiController.buildModels$lambda$5$lambda$4(i2, i3, i4);
                return buildModels$lambda$5$lambda$42;
            case 14:
                buildModels$lambda$7$lambda$6 = ReleaseStreamingPlatformUiController.buildModels$lambda$7$lambda$6(i2, i3, i4);
                return buildModels$lambda$7$lambda$6;
            case 15:
                buildModels$lambda$9$lambda$8 = ReleaseStreamingPlatformUiController.buildModels$lambda$9$lambda$8(i2, i3, i4);
                return buildModels$lambda$9$lambda$8;
            default:
                return i2;
        }
    }

    @Override // com.yandex.div.json.TemplateParsingEnvironment.TemplateFactory
    /* renamed from: e */
    public Object mo17530e(ParsingEnvironment parsingEnvironment, boolean z, JSONObject jSONObject) {
        return DivTemplate.f39864a.m17715a(parsingEnvironment, z, jSONObject);
    }

    @Override // com.yandex.div.core.DivViewConfig
    /* renamed from: f */
    public /* synthetic */ int mo16606f() {
        return 0;
    }

    @Override // com.yandex.div.core.DivPreloader.Callback
    /* renamed from: g */
    public void mo16589g(boolean z) {
        int i2 = DivPreloader.f30970d;
    }
}
