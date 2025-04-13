package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div2.Div;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: DivTemplate.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate;", "Lcom/yandex/div/json/JSONSerializable;", "Lcom/yandex/div/json/JsonTemplate;", "Lcom/yandex/div2/Div;", "Companion", "Container", "Custom", "Gallery", "GifImage", "Grid", "Image", "Indicator", "Input", "Pager", "Select", "Separator", "Slider", "State", "Tabs", "Text", "Video", "Lcom/yandex/div2/DivTemplate$Image;", "Lcom/yandex/div2/DivTemplate$GifImage;", "Lcom/yandex/div2/DivTemplate$Text;", "Lcom/yandex/div2/DivTemplate$Separator;", "Lcom/yandex/div2/DivTemplate$Container;", "Lcom/yandex/div2/DivTemplate$Grid;", "Lcom/yandex/div2/DivTemplate$Gallery;", "Lcom/yandex/div2/DivTemplate$Pager;", "Lcom/yandex/div2/DivTemplate$Tabs;", "Lcom/yandex/div2/DivTemplate$State;", "Lcom/yandex/div2/DivTemplate$Custom;", "Lcom/yandex/div2/DivTemplate$Indicator;", "Lcom/yandex/div2/DivTemplate$Slider;", "Lcom/yandex/div2/DivTemplate$Input;", "Lcom/yandex/div2/DivTemplate$Select;", "Lcom/yandex/div2/DivTemplate$Video;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class DivTemplate implements JSONSerializable, JsonTemplate<Div> {

    /* renamed from: a */
    @NotNull
    public static final Companion f39864a = new Companion(null);

    /* renamed from: b */
    @NotNull
    public static final Function2<ParsingEnvironment, JSONObject, DivTemplate> f39865b = new Function2<ParsingEnvironment, JSONObject, DivTemplate>() { // from class: com.yandex.div2.DivTemplate$Companion$CREATOR$1
        @Override // kotlin.jvm.functions.Function2
        public DivTemplate invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            ParsingEnvironment env = parsingEnvironment;
            JSONObject it = jSONObject;
            Intrinsics.m32179h(env, "env");
            Intrinsics.m32179h(it, "it");
            return DivTemplate.f39864a.m17715a(env, false, it);
        }
    };

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Companion;", "", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final DivTemplate m17715a(@NotNull ParsingEnvironment parsingEnvironment, boolean z, @NotNull JSONObject jSONObject) throws ParsingException {
            String str;
            String str2;
            String str3 = (String) C3033a.m17741c(parsingEnvironment, "env", jSONObject, "json", jSONObject, "type", null, parsingEnvironment, 2);
            JsonTemplate<?> jsonTemplate = parsingEnvironment.mo17207b().get(str3);
            DivTemplate divTemplate = jsonTemplate instanceof DivTemplate ? (DivTemplate) jsonTemplate : null;
            if (divTemplate == null) {
                str = "container";
                str2 = str3;
            } else {
                str = "container";
                if (divTemplate instanceof Image) {
                    str2 = "image";
                } else if (divTemplate instanceof GifImage) {
                    str2 = "gif";
                } else if (divTemplate instanceof Text) {
                    str2 = "text";
                } else if (divTemplate instanceof Separator) {
                    str2 = "separator";
                } else if (divTemplate instanceof Container) {
                    str2 = str;
                } else if (divTemplate instanceof Grid) {
                    str2 = "grid";
                } else if (divTemplate instanceof Gallery) {
                    str2 = "gallery";
                } else if (divTemplate instanceof Pager) {
                    str2 = "pager";
                } else if (divTemplate instanceof Tabs) {
                    str2 = "tabs";
                } else if (divTemplate instanceof State) {
                    str2 = "state";
                } else if (divTemplate instanceof Custom) {
                    str2 = "custom";
                } else if (divTemplate instanceof Indicator) {
                    str2 = "indicator";
                } else if (divTemplate instanceof Slider) {
                    str2 = "slider";
                } else if (divTemplate instanceof Input) {
                    str2 = "input";
                } else if (divTemplate instanceof Select) {
                    str2 = "select";
                } else {
                    if (!(divTemplate instanceof Video)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str2 = "video";
                }
            }
            switch (str2.hashCode()) {
                case -1349088399:
                    if (str2.equals("custom")) {
                        return new Custom(new DivCustomTemplate(parsingEnvironment, (DivCustomTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case -906021636:
                    if (str2.equals("select")) {
                        return new Select(new DivSelectTemplate(parsingEnvironment, (DivSelectTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case -899647263:
                    if (str2.equals("slider")) {
                        return new Slider(new DivSliderTemplate(parsingEnvironment, (DivSliderTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case -711999985:
                    if (str2.equals("indicator")) {
                        return new Indicator(new DivIndicatorTemplate(parsingEnvironment, (DivIndicatorTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case -410956671:
                    if (str2.equals(str)) {
                        return new Container(new DivContainerTemplate(parsingEnvironment, (DivContainerTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case -196315310:
                    if (str2.equals("gallery")) {
                        return new Gallery(new DivGalleryTemplate(parsingEnvironment, (DivGalleryTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 102340:
                    if (str2.equals("gif")) {
                        return new GifImage(new DivGifImageTemplate(parsingEnvironment, (DivGifImageTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 3181382:
                    if (str2.equals("grid")) {
                        return new Grid(new DivGridTemplate(parsingEnvironment, (DivGridTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 3552126:
                    if (str2.equals("tabs")) {
                        return new Tabs(new DivTabsTemplate(parsingEnvironment, (DivTabsTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 3556653:
                    if (str2.equals("text")) {
                        return new Text(new DivTextTemplate(parsingEnvironment, (DivTextTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 100313435:
                    if (str2.equals("image")) {
                        return new Image(new DivImageTemplate(parsingEnvironment, (DivImageTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 100358090:
                    if (str2.equals("input")) {
                        return new Input(new DivInputTemplate(parsingEnvironment, (DivInputTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 106426307:
                    if (str2.equals("pager")) {
                        return new Pager(new DivPagerTemplate(parsingEnvironment, (DivPagerTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 109757585:
                    if (str2.equals("state")) {
                        return new State(new DivStateTemplate(parsingEnvironment, (DivStateTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 112202875:
                    if (str2.equals("video")) {
                        return new Video(new DivVideoTemplate(parsingEnvironment, (DivVideoTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
                case 1732829925:
                    if (str2.equals("separator")) {
                        return new Separator(new DivSeparatorTemplate(parsingEnvironment, (DivSeparatorTemplate) (divTemplate == null ? null : divTemplate.m17714c()), z, jSONObject));
                    }
                    break;
            }
            throw ParsingExceptionKt.m17528m(jSONObject, "type", str2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Container;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Container extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivContainerTemplate f39867c;

        public Container(@NotNull DivContainerTemplate divContainerTemplate) {
            super(null);
            this.f39867c = divContainerTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Custom;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Custom extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivCustomTemplate f39868c;

        public Custom(@NotNull DivCustomTemplate divCustomTemplate) {
            super(null);
            this.f39868c = divCustomTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Gallery;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Gallery extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivGalleryTemplate f39869c;

        public Gallery(@NotNull DivGalleryTemplate divGalleryTemplate) {
            super(null);
            this.f39869c = divGalleryTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$GifImage;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class GifImage extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivGifImageTemplate f39870c;

        public GifImage(@NotNull DivGifImageTemplate divGifImageTemplate) {
            super(null);
            this.f39870c = divGifImageTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Grid;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Grid extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivGridTemplate f39871c;

        public Grid(@NotNull DivGridTemplate divGridTemplate) {
            super(null);
            this.f39871c = divGridTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Image;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Image extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivImageTemplate f39872c;

        public Image(@NotNull DivImageTemplate divImageTemplate) {
            super(null);
            this.f39872c = divImageTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Indicator;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Indicator extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivIndicatorTemplate f39873c;

        public Indicator(@NotNull DivIndicatorTemplate divIndicatorTemplate) {
            super(null);
            this.f39873c = divIndicatorTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Input;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Input extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivInputTemplate f39874c;

        public Input(@NotNull DivInputTemplate divInputTemplate) {
            super(null);
            this.f39874c = divInputTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Pager;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Pager extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivPagerTemplate f39875c;

        public Pager(@NotNull DivPagerTemplate divPagerTemplate) {
            super(null);
            this.f39875c = divPagerTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Select;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Select extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivSelectTemplate f39876c;

        public Select(@NotNull DivSelectTemplate divSelectTemplate) {
            super(null);
            this.f39876c = divSelectTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Separator;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Separator extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivSeparatorTemplate f39877c;

        public Separator(@NotNull DivSeparatorTemplate divSeparatorTemplate) {
            super(null);
            this.f39877c = divSeparatorTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Slider;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Slider extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivSliderTemplate f39878c;

        public Slider(@NotNull DivSliderTemplate divSliderTemplate) {
            super(null);
            this.f39878c = divSliderTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$State;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class State extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivStateTemplate f39879c;

        public State(@NotNull DivStateTemplate divStateTemplate) {
            super(null);
            this.f39879c = divStateTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Tabs;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Tabs extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivTabsTemplate f39880c;

        public Tabs(@NotNull DivTabsTemplate divTabsTemplate) {
            super(null);
            this.f39880c = divTabsTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Text;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Text extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivTextTemplate f39881c;

        public Text(@NotNull DivTextTemplate divTextTemplate) {
            super(null);
            this.f39881c = divTextTemplate;
        }
    }

    /* compiled from: DivTemplate.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div2/DivTemplate$Video;", "Lcom/yandex/div2/DivTemplate;", "div-data_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static class Video extends DivTemplate {

        /* renamed from: c */
        @NotNull
        public final DivVideoTemplate f39882c;

        public Video(@NotNull DivVideoTemplate divVideoTemplate) {
            super(null);
            this.f39882c = divVideoTemplate;
        }
    }

    public DivTemplate() {
    }

    @Override // com.yandex.div.json.JsonTemplate
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Div mo17514a(@NotNull ParsingEnvironment env, @NotNull JSONObject data) {
        Intrinsics.m32179h(env, "env");
        Intrinsics.m32179h(data, "data");
        if (this instanceof Image) {
            return new Div.Image(((Image) this).f39872c.mo17514a(env, data));
        }
        if (this instanceof GifImage) {
            return new Div.GifImage(((GifImage) this).f39870c.mo17514a(env, data));
        }
        if (this instanceof Text) {
            return new Div.Text(((Text) this).f39881c.mo17514a(env, data));
        }
        if (this instanceof Separator) {
            return new Div.Separator(((Separator) this).f39877c.mo17514a(env, data));
        }
        if (this instanceof Container) {
            return new Div.Container(((Container) this).f39867c.mo17514a(env, data));
        }
        if (this instanceof Grid) {
            return new Div.Grid(((Grid) this).f39871c.mo17514a(env, data));
        }
        if (this instanceof Gallery) {
            return new Div.Gallery(((Gallery) this).f39869c.mo17514a(env, data));
        }
        if (this instanceof Pager) {
            return new Div.Pager(((Pager) this).f39875c.mo17514a(env, data));
        }
        if (this instanceof Tabs) {
            return new Div.Tabs(((Tabs) this).f39880c.mo17514a(env, data));
        }
        if (this instanceof State) {
            return new Div.State(((State) this).f39879c.mo17514a(env, data));
        }
        if (this instanceof Custom) {
            return new Div.Custom(((Custom) this).f39868c.mo17514a(env, data));
        }
        if (this instanceof Indicator) {
            return new Div.Indicator(((Indicator) this).f39873c.mo17514a(env, data));
        }
        if (this instanceof Slider) {
            return new Div.Slider(((Slider) this).f39878c.mo17514a(env, data));
        }
        if (this instanceof Input) {
            return new Div.Input(((Input) this).f39874c.mo17514a(env, data));
        }
        if (this instanceof Select) {
            return new Div.Select(((Select) this).f39876c.mo17514a(env, data));
        }
        if (this instanceof Video) {
            return new Div.Video(((Video) this).f39882c.mo17514a(env, data));
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    /* renamed from: c */
    public Object m17714c() {
        if (this instanceof Image) {
            return ((Image) this).f39872c;
        }
        if (this instanceof GifImage) {
            return ((GifImage) this).f39870c;
        }
        if (this instanceof Text) {
            return ((Text) this).f39881c;
        }
        if (this instanceof Separator) {
            return ((Separator) this).f39877c;
        }
        if (this instanceof Container) {
            return ((Container) this).f39867c;
        }
        if (this instanceof Grid) {
            return ((Grid) this).f39871c;
        }
        if (this instanceof Gallery) {
            return ((Gallery) this).f39869c;
        }
        if (this instanceof Pager) {
            return ((Pager) this).f39875c;
        }
        if (this instanceof Tabs) {
            return ((Tabs) this).f39880c;
        }
        if (this instanceof State) {
            return ((State) this).f39879c;
        }
        if (this instanceof Custom) {
            return ((Custom) this).f39868c;
        }
        if (this instanceof Indicator) {
            return ((Indicator) this).f39873c;
        }
        if (this instanceof Slider) {
            return ((Slider) this).f39878c;
        }
        if (this instanceof Input) {
            return ((Input) this).f39874c;
        }
        if (this instanceof Select) {
            return ((Select) this).f39876c;
        }
        if (this instanceof Video) {
            return ((Video) this).f39882c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public DivTemplate(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
