package com.yandex.div2;

import com.yandex.div.internal.parser.C2904b;
import com.yandex.div.internal.parser.JsonParserKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.Div;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: Div.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0010\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, m31884d2 = {"Lcom/yandex/div2/Div;", "Lcom/yandex/div/json/JSONSerializable;", "Companion", "Container", "Custom", "Gallery", "GifImage", "Grid", "Image", "Indicator", "Input", "Pager", "Select", "Separator", "Slider", "State", "Tabs", "Text", "Video", "Lcom/yandex/div2/Div$Image;", "Lcom/yandex/div2/Div$GifImage;", "Lcom/yandex/div2/Div$Text;", "Lcom/yandex/div2/Div$Separator;", "Lcom/yandex/div2/Div$Container;", "Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div2/Div$Tabs;", "Lcom/yandex/div2/Div$State;", "Lcom/yandex/div2/Div$Custom;", "Lcom/yandex/div2/Div$Indicator;", "Lcom/yandex/div2/Div$Slider;", "Lcom/yandex/div2/Div$Input;", "Lcom/yandex/div2/Div$Select;", "Lcom/yandex/div2/Div$Video;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class Div implements JSONSerializable {

    /* renamed from: a */
    @NotNull
    public static final Companion f34418a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, Div> f34419b = new Function2<ParsingEnvironment, JSONObject, Div>() { // from class: com.yandex.div2.Div$Companion$CREATOR$1
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
         */
        @Override // kotlin.jvm.functions.Function2
        public Div invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            Object m17338a;
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            Div.Companion companion = Div.f34418a;
            m17338a = JsonParserKt.m17338a(it, "type", (r5 & 2) != 0 ? C2904b.f33860g : null, env.getF33840b(), env);
            String str = (String) m17338a;
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        return new Div.Custom(DivCustom.f35258D.m17607a(env, it));
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        return new Div.Select(DivSelect.f38266L.m17689a(env, it));
                    }
                    break;
                case -899647263:
                    if (str.equals("slider")) {
                        return new Div.Slider(DivSlider.f38908M.m17703a(env, it));
                    }
                    break;
                case -711999985:
                    if (str.equals("indicator")) {
                        return new Div.Indicator(DivIndicator.f37014M.m17635a(env, it));
                    }
                    break;
                case -410956671:
                    if (str.equals("container")) {
                        return new Div.Container(DivContainer.f34884N.m17600a(env, it));
                    }
                    break;
                case -196315310:
                    if (str.equals("gallery")) {
                        return new Div.Gallery(DivGallery.f35892J.m17624a(env, it));
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        return new Div.GifImage(DivGifImage.f36160N.m17626a(env, it));
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        return new Div.Grid(DivGrid.f36419J.m17628a(env, it));
                    }
                    break;
                case 3552126:
                    if (str.equals("tabs")) {
                        return new Div.Tabs(DivTabs.f39463K.m17711a(env, it));
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return new Div.Text(DivText.f39909a0.m17716a(env, it));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        return new Div.Image(DivImage.f36662S.m17630a(env, it));
                    }
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        return new Div.Input(DivInput.f37287R.m17639a(env, it));
                    }
                    break;
                case 106426307:
                    if (str.equals("pager")) {
                        return new Div.Pager(DivPager.f37748G.m17661a(env, it));
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        return new Div.State(DivState.f39193E.m17707a(env, it));
                    }
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        return new Div.Video(DivVideo.f40644L.m17726a(env, it));
                    }
                    break;
                case 1732829925:
                    if (str.equals("separator")) {
                        return new Div.Separator(DivSeparator.f38536G.m17691a(env, it));
                    }
                    break;
            }
            JsonTemplate<?> mo17515a = env.mo17207b().mo17515a(str, it);
            DivTemplate divTemplate = mo17515a instanceof DivTemplate ? (DivTemplate) mo17515a : null;
            if (divTemplate != null) {
                return divTemplate.m17713b(env, it);
            }
            throw ParsingExceptionKt.m17528m(it, "type", str);
        }
    };

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Container;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Container extends Div {

        /* renamed from: c */
        @NotNull
        public final DivContainer f34421c;

        public Container(@NotNull DivContainer divContainer) {
            super(null);
            this.f34421c = divContainer;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Custom;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Custom extends Div {

        /* renamed from: c */
        @NotNull
        public final DivCustom f34422c;

        public Custom(@NotNull DivCustom divCustom) {
            super(null);
            this.f34422c = divCustom;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Gallery;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Gallery extends Div {

        /* renamed from: c */
        @NotNull
        public final DivGallery f34423c;

        public Gallery(@NotNull DivGallery divGallery) {
            super(null);
            this.f34423c = divGallery;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$GifImage;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class GifImage extends Div {

        /* renamed from: c */
        @NotNull
        public final DivGifImage f34424c;

        public GifImage(@NotNull DivGifImage divGifImage) {
            super(null);
            this.f34424c = divGifImage;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Grid;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Grid extends Div {

        /* renamed from: c */
        @NotNull
        public final DivGrid f34425c;

        public Grid(@NotNull DivGrid divGrid) {
            super(null);
            this.f34425c = divGrid;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Image;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Image extends Div {

        /* renamed from: c */
        @NotNull
        public final DivImage f34426c;

        public Image(@NotNull DivImage divImage) {
            super(null);
            this.f34426c = divImage;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Indicator;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Indicator extends Div {

        /* renamed from: c */
        @NotNull
        public final DivIndicator f34427c;

        public Indicator(@NotNull DivIndicator divIndicator) {
            super(null);
            this.f34427c = divIndicator;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Input;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Input extends Div {

        /* renamed from: c */
        @NotNull
        public final DivInput f34428c;

        public Input(@NotNull DivInput divInput) {
            super(null);
            this.f34428c = divInput;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Pager;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Pager extends Div {

        /* renamed from: c */
        @NotNull
        public final DivPager f34429c;

        public Pager(@NotNull DivPager divPager) {
            super(null);
            this.f34429c = divPager;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Select;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Select extends Div {

        /* renamed from: c */
        @NotNull
        public final DivSelect f34430c;

        public Select(@NotNull DivSelect divSelect) {
            super(null);
            this.f34430c = divSelect;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Separator;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Separator extends Div {

        /* renamed from: c */
        @NotNull
        public final DivSeparator f34431c;

        public Separator(@NotNull DivSeparator divSeparator) {
            super(null);
            this.f34431c = divSeparator;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Slider;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Slider extends Div {

        /* renamed from: c */
        @NotNull
        public final DivSlider f34432c;

        public Slider(@NotNull DivSlider divSlider) {
            super(null);
            this.f34432c = divSlider;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$State;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class State extends Div {

        /* renamed from: c */
        @NotNull
        public final DivState f34433c;

        public State(@NotNull DivState divState) {
            super(null);
            this.f34433c = divState;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Tabs;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Tabs extends Div {

        /* renamed from: c */
        @NotNull
        public final DivTabs f34434c;

        public Tabs(@NotNull DivTabs divTabs) {
            super(null);
            this.f34434c = divTabs;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Text;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Text extends Div {

        /* renamed from: c */
        @NotNull
        public final DivText f34435c;

        public Text(@NotNull DivText divText) {
            super(null);
            this.f34435c = divText;
        }
    }

    /* compiled from: Div.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/Div$Video;", "Lcom/yandex/div2/Div;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Video extends Div {

        /* renamed from: c */
        @NotNull
        public final DivVideo f34436c;

        public Video(@NotNull DivVideo divVideo) {
            super(null);
            this.f34436c = divVideo;
        }
    }

    public Div() {
    }

    @NotNull
    /* renamed from: a */
    public DivBase m17557a() {
        if (this instanceof Image) {
            return ((Image) this).f34426c;
        }
        if (this instanceof GifImage) {
            return ((GifImage) this).f34424c;
        }
        if (this instanceof Text) {
            return ((Text) this).f34435c;
        }
        if (this instanceof Separator) {
            return ((Separator) this).f34431c;
        }
        if (this instanceof Container) {
            return ((Container) this).f34421c;
        }
        if (this instanceof Grid) {
            return ((Grid) this).f34425c;
        }
        if (this instanceof Gallery) {
            return ((Gallery) this).f34423c;
        }
        if (this instanceof Pager) {
            return ((Pager) this).f34429c;
        }
        if (this instanceof Tabs) {
            return ((Tabs) this).f34434c;
        }
        if (this instanceof State) {
            return ((State) this).f34433c;
        }
        if (this instanceof Custom) {
            return ((Custom) this).f34422c;
        }
        if (this instanceof Indicator) {
            return ((Indicator) this).f34427c;
        }
        if (this instanceof Slider) {
            return ((Slider) this).f34432c;
        }
        if (this instanceof Input) {
            return ((Input) this).f34428c;
        }
        if (this instanceof Select) {
            return ((Select) this).f34430c;
        }
        if (this instanceof Video) {
            return ((Video) this).f34436c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public Div(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
