package com.yandex.div.core.util.mask;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: CurrencyInputMask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/util/mask/CurrencyInputMask;", "Lcom/yandex/div/core/util/mask/BaseInputMask;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CurrencyInputMask extends BaseInputMask {

    /* renamed from: e */
    @NotNull
    public final Function1<Exception, Unit> f31488e;

    /* renamed from: f */
    public final char f31489f;

    /* renamed from: g */
    @NotNull
    public final List<Character> f31490g;

    /* renamed from: h */
    @NotNull
    public NumberFormat f31491h;

    /* JADX WARN: Multi-variable type inference failed */
    public CurrencyInputMask(@NotNull Locale locale, @NotNull Function1<? super Exception, Unit> function1) {
        super(new BaseInputMask.MaskData("", EmptyList.f63144b, false));
        this.f31488e = function1;
        this.f31489f = (char) 164;
        this.f31490g = CollectionsKt.m31994G('.', ',');
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        Intrinsics.m32178g(currencyInstance, "getCurrencyInstance(locale)");
        m16783o(currencyInstance);
        this.f31491h = currencyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019d A[EDGE_INSN: B:139:0x019d->B:102:0x019d BREAK  A[LOOP:5: B:94:0x0182->B:99:0x019b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16770a(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.Integer r21) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.mask.CurrencyInputMask.mo16770a(java.lang.String, java.lang.Integer):void");
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /* renamed from: j */
    public void mo16779j(@NotNull Exception exc) {
        this.f31488e.invoke(exc);
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    /* renamed from: k */
    public void mo16780k(@NotNull String str) {
        Number parse = this.f31491h.parse(str);
        if (parse == null) {
            parse = 0;
        }
        m16786r(parse);
        super.mo16780k(str);
    }

    /* renamed from: o */
    public final NumberFormat m16783o(NumberFormat numberFormat) {
        DecimalFormat decimalFormat = numberFormat instanceof DecimalFormat ? (DecimalFormat) numberFormat : null;
        if (decimalFormat != null) {
            String pattern = decimalFormat.toPattern();
            Intrinsics.m32178g(pattern, "toPattern()");
            StringBuilder sb = new StringBuilder();
            int length = pattern.length();
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 1;
                char charAt = pattern.charAt(i2);
                if (charAt != this.f31489f) {
                    sb.append(charAt);
                }
                i2 = i3;
            }
            String sb2 = sb.toString();
            Intrinsics.m32178g(sb2, "filterTo(StringBuilder(), predicate).toString()");
            decimalFormat.applyPattern(StringsKt.m33914n0(sb2).toString());
        }
        return numberFormat;
    }

    /* renamed from: p */
    public final DecimalFormatSymbols m16784p() {
        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) this.f31491h).getDecimalFormatSymbols();
        Intrinsics.m32178g(decimalFormatSymbols, "currencyFormatter as Dec…mat).decimalFormatSymbols");
        return decimalFormatSymbols;
    }

    /* renamed from: q */
    public final boolean m16785q(TextDiff textDiff, int i2) {
        int i3 = textDiff.f31494a;
        return i3 <= i2 && i2 < i3 + textDiff.f31495b;
    }

    /* renamed from: r */
    public final void m16786r(Number number) {
        String formatted = this.f31491h.format(number);
        Intrinsics.m32178g(formatted, "formatted");
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < formatted.length()) {
            char charAt = formatted.charAt(i2);
            i2++;
            if (Character.isDigit(charAt)) {
                sb.append('#');
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "StringBuilder().apply(builderAction).toString()");
        char decimalSeparator = m16784p().getDecimalSeparator();
        StringBuilder m2872a = C0321a.m2872a('[');
        m2872a.append(m16784p().getDecimalSeparator());
        m2872a.append(']');
        m16782n(new BaseInputMask.MaskData(sb2, CollectionsKt.m31994G(new BaseInputMask.MaskKey('#', "\\d", '0'), new BaseInputMask.MaskKey(decimalSeparator, m2872a.toString(), m16784p().getDecimalSeparator())), this.f31472a.f31482c), false);
    }
}
