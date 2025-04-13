package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: BaseInputMask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask;", "", "MaskChar", "MaskData", "MaskKey", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public abstract class BaseInputMask {

    /* renamed from: a */
    @NotNull
    public MaskData f31472a;

    /* renamed from: b */
    @NotNull
    public final Map<Character, Regex> f31473b = new LinkedHashMap();

    /* renamed from: c */
    public List<? extends MaskChar> f31474c;

    /* renamed from: d */
    public int f31475d;

    /* compiled from: BaseInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "", "Dynamic", "Static", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Static;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static abstract class MaskChar {

        /* compiled from: BaseInputMask.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Dynamic;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Dynamic extends MaskChar {

            /* renamed from: a */
            @Nullable
            public Character f31476a;

            /* renamed from: b */
            @Nullable
            public final Regex f31477b;

            /* renamed from: c */
            public final char f31478c;

            public Dynamic(@Nullable Character ch, @Nullable Regex regex, char c2) {
                super(null);
                this.f31476a = null;
                this.f31477b = regex;
                this.f31478c = c2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj;
                return Intrinsics.m32174c(this.f31476a, dynamic.f31476a) && Intrinsics.m32174c(this.f31477b, dynamic.f31477b) && this.f31478c == dynamic.f31478c;
            }

            public int hashCode() {
                Character ch = this.f31476a;
                int hashCode = (ch == null ? 0 : ch.hashCode()) * 31;
                Regex regex = this.f31477b;
                return ((hashCode + (regex != null ? regex.hashCode() : 0)) * 31) + this.f31478c;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Dynamic(char=");
                m24u.append(this.f31476a);
                m24u.append(", filter=");
                m24u.append(this.f31477b);
                m24u.append(", placeholder=");
                m24u.append(this.f31478c);
                m24u.append(')');
                return m24u.toString();
            }
        }

        /* compiled from: BaseInputMask.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar$Static;", "Lcom/yandex/div/core/util/mask/BaseInputMask$MaskChar;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final /* data */ class Static extends MaskChar {

            /* renamed from: a */
            public final char f31479a;

            public Static(char c2) {
                super(null);
                this.f31479a = c2;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f31479a == ((Static) obj).f31479a;
            }

            public int hashCode() {
                return this.f31479a;
            }

            @NotNull
            public String toString() {
                StringBuilder m24u = C0000a.m24u("Static(char=");
                m24u.append(this.f31479a);
                m24u.append(')');
                return m24u.toString();
            }
        }

        public MaskChar() {
        }

        public MaskChar(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskData;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class MaskData {

        /* renamed from: a */
        @NotNull
        public final String f31480a;

        /* renamed from: b */
        @NotNull
        public final List<MaskKey> f31481b;

        /* renamed from: c */
        public final boolean f31482c;

        public MaskData(@NotNull String pattern, @NotNull List<MaskKey> list, boolean z) {
            Intrinsics.m32179h(pattern, "pattern");
            this.f31480a = pattern;
            this.f31481b = list;
            this.f31482c = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) obj;
            return Intrinsics.m32174c(this.f31480a, maskData.f31480a) && Intrinsics.m32174c(this.f31481b, maskData.f31481b) && this.f31482c == maskData.f31482c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = (this.f31481b.hashCode() + (this.f31480a.hashCode() * 31)) * 31;
            boolean z = this.f31482c;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return hashCode + i2;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("MaskData(pattern=");
            m24u.append(this.f31480a);
            m24u.append(", decoding=");
            m24u.append(this.f31481b);
            m24u.append(", alwaysVisible=");
            m24u.append(this.f31482c);
            m24u.append(')');
            return m24u.toString();
        }
    }

    /* compiled from: BaseInputMask.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/BaseInputMask$MaskKey;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class MaskKey {

        /* renamed from: a */
        public final char f31483a;

        /* renamed from: b */
        @Nullable
        public final String f31484b;

        /* renamed from: c */
        public final char f31485c;

        public MaskKey(char c2, @Nullable String str, char c3) {
            this.f31483a = c2;
            this.f31484b = str;
            this.f31485c = c3;
        }
    }

    public BaseInputMask(@NotNull MaskData maskData) {
        this.f31472a = maskData;
        m16782n(maskData, true);
    }

    /* renamed from: a */
    public void mo16770a(@NotNull String newValue, @Nullable Integer num) {
        int i2;
        Intrinsics.m32179h(newValue, "newValue");
        TextDiff m16787a = TextDiff.f31493d.m16787a(m16778i(), newValue);
        if (num != null) {
            int intValue = num.intValue();
            int i3 = m16787a.f31495b;
            int i4 = intValue - i3;
            if (i4 < 0) {
                i4 = 0;
            }
            m16787a = new TextDiff(i4, i3, m16787a.f31496c);
        }
        int i5 = m16787a.f31494a;
        String substring = newValue.substring(i5, m16787a.f31495b + i5);
        Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String m16774e = m16774e(m16787a.f31494a + m16787a.f31496c, m16775f().size() - 1);
        m16772c(m16787a);
        int m16776g = m16776g();
        if (this.f31473b.size() <= 1) {
            int i6 = 0;
            for (int i7 = m16776g; i7 < m16775f().size(); i7++) {
                if (m16775f().get(i7) instanceof MaskChar.Dynamic) {
                    i6++;
                }
            }
            i2 = i6 - m16774e.length();
        } else {
            String m16771b = m16771b(m16774e, m16776g);
            int i8 = 0;
            while (i8 < m16775f().size() && Intrinsics.m32174c(m16771b, m16771b(m16774e, m16776g + i8))) {
                i8++;
            }
            i2 = i8 - 1;
        }
        m16781l(substring, m16776g, Integer.valueOf(i2 >= 0 ? i2 : 0));
        int m16776g2 = m16776g();
        m16781l(m16774e, m16776g2, null);
        int m16776g3 = m16776g();
        if (m16787a.f31494a < m16776g3) {
            while (m16776g2 < m16775f().size() && !(m16775f().get(m16776g2) instanceof MaskChar.Dynamic)) {
                m16776g2++;
            }
            m16776g3 = Math.min(m16776g2, m16778i().length());
        }
        this.f31475d = m16776g3;
    }

    @NotNull
    /* renamed from: b */
    public final String m16771b(@NotNull String substring, int i2) {
        Intrinsics.m32179h(substring, "substring");
        StringBuilder sb = new StringBuilder();
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.f63349b = i2;
        Function0<Regex> function0 = new Function0<Regex>() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Regex invoke() {
                while (Ref.IntRef.this.f63349b < this.m16775f().size() && !(this.m16775f().get(Ref.IntRef.this.f63349b) instanceof BaseInputMask.MaskChar.Dynamic)) {
                    Ref.IntRef.this.f63349b++;
                }
                Object m32048y = CollectionsKt.m32048y(this.m16775f(), Ref.IntRef.this.f63349b);
                BaseInputMask.MaskChar.Dynamic dynamic = m32048y instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) m32048y : null;
                if (dynamic == null) {
                    return null;
                }
                return dynamic.f31477b;
            }
        };
        int i3 = 0;
        while (i3 < substring.length()) {
            char charAt = substring.charAt(i3);
            i3++;
            Regex invoke = function0.invoke();
            if (invoke != null && invoke.m33872d(String.valueOf(charAt))) {
                sb.append(charAt);
                intRef.f63349b++;
            }
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "charsCanBeInsertedStringBuilder.toString()");
        return sb2;
    }

    /* renamed from: c */
    public final void m16772c(@NotNull TextDiff textDiff) {
        if (textDiff.f31495b == 0 && textDiff.f31496c == 1) {
            int i2 = textDiff.f31494a;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                MaskChar maskChar = m16775f().get(i2);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.f31476a != null) {
                        dynamic.f31476a = null;
                        break;
                    }
                }
                i2--;
            }
        }
        m16773d(textDiff.f31494a, m16775f().size());
    }

    /* renamed from: d */
    public final void m16773d(int i2, int i3) {
        while (i2 < i3 && i2 < m16775f().size()) {
            MaskChar maskChar = m16775f().get(i2);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).f31476a = null;
            }
            i2++;
        }
    }

    @NotNull
    /* renamed from: e */
    public final String m16774e(int i2, int i3) {
        Character ch;
        StringBuilder sb = new StringBuilder();
        while (i2 <= i3) {
            MaskChar maskChar = m16775f().get(i2);
            if ((maskChar instanceof MaskChar.Dynamic) && (ch = ((MaskChar.Dynamic) maskChar).f31476a) != null) {
                sb.append(ch);
            }
            i2++;
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "tailStringBuilder.toString()");
        return sb2;
    }

    @NotNull
    /* renamed from: f */
    public final List<MaskChar> m16775f() {
        List list = this.f31474c;
        if (list != null) {
            return list;
        }
        Intrinsics.m32189r("destructedValue");
        throw null;
    }

    /* renamed from: g */
    public final int m16776g() {
        Iterator<MaskChar> it = m16775f().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            MaskChar next = it.next();
            if ((next instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) next).f31476a == null) {
                break;
            }
            i2++;
        }
        return i2 != -1 ? i2 : m16775f().size();
    }

    @NotNull
    /* renamed from: h */
    public final String m16777h() {
        return m16774e(0, m16775f().size() - 1);
    }

    @NotNull
    /* renamed from: i */
    public final String m16778i() {
        Character ch;
        StringBuilder sb = new StringBuilder();
        List<MaskChar> m16775f = m16775f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m16775f) {
            MaskChar maskChar = (MaskChar) obj;
            boolean z = true;
            if (maskChar instanceof MaskChar.Static) {
                sb.append(((MaskChar.Static) maskChar).f31479a);
            } else if ((maskChar instanceof MaskChar.Dynamic) && (ch = ((MaskChar.Dynamic) maskChar).f31476a) != null) {
                sb.append(ch);
            } else if (this.f31472a.f31482c) {
                sb.append(((MaskChar.Dynamic) maskChar).f31478c);
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            arrayList.add(obj);
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: j */
    public abstract void mo16779j(@NotNull Exception exc);

    /* renamed from: k */
    public void mo16780k(@NotNull String str) {
        m16773d(0, m16775f().size());
        m16781l(str, 0, null);
        this.f31475d = Math.min(this.f31475d, m16778i().length());
    }

    /* renamed from: l */
    public final void m16781l(@NotNull String substring, int i2, @Nullable Integer num) {
        Intrinsics.m32179h(substring, "substring");
        String m16771b = m16771b(substring, i2);
        if (num != null) {
            m16771b = StringsKt.m33907g0(m16771b, num.intValue());
        }
        int i3 = 0;
        while (i2 < m16775f().size() && i3 < m16771b.length()) {
            MaskChar maskChar = m16775f().get(i2);
            char charAt = m16771b.charAt(i3);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).f31476a = Character.valueOf(charAt);
                i3++;
            }
            i2++;
        }
    }

    /* renamed from: n */
    public void m16782n(@NotNull MaskData newMaskData, boolean z) {
        Object obj;
        Intrinsics.m32179h(newMaskData, "newMaskData");
        String m16777h = (Intrinsics.m32174c(this.f31472a, newMaskData) || !z) ? null : m16777h();
        this.f31472a = newMaskData;
        this.f31473b.clear();
        for (MaskKey maskKey : this.f31472a.f31481b) {
            try {
                String str = maskKey.f31484b;
                if (str != null) {
                    this.f31473b.put(Character.valueOf(maskKey.f31483a), new Regex(str));
                }
            } catch (PatternSyntaxException e2) {
                mo16779j(e2);
            }
        }
        String str2 = this.f31472a.f31480a;
        ArrayList arrayList = new ArrayList(str2.length());
        int i2 = 0;
        while (i2 < str2.length()) {
            char charAt = str2.charAt(i2);
            i2++;
            Iterator<T> it = this.f31472a.f31481b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((MaskKey) obj).f31483a == charAt) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            MaskKey maskKey2 = (MaskKey) obj;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.f31473b.get(Character.valueOf(maskKey2.f31483a)), maskKey2.f31485c) : new MaskChar.Static(charAt));
        }
        this.f31474c = arrayList;
        if (m16777h != null) {
            mo16780k(m16777h);
        }
    }
}
