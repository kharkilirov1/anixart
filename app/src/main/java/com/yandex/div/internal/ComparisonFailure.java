package com.yandex.div.internal;

import androidx.emoji2.text.flatbuffer.C0321a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComparisonFailure.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/internal/ComparisonFailure;", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "Companion", "ComparisonCompactor", "assertion_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ComparisonFailure extends AssertionError {

    /* renamed from: b */
    @NotNull
    public final String f33710b;

    /* renamed from: c */
    @NotNull
    public final String f33711c;

    /* compiled from: ComparisonFailure.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31884d2 = {"Lcom/yandex/div/internal/ComparisonFailure$Companion;", "", "", "MAX_CONTEXT_LENGTH", "I", "", "serialVersionUID", "J", "assertion_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: ComparisonFailure.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/internal/ComparisonFailure$ComparisonCompactor;", "", "Companion", "assertion_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class ComparisonCompactor {

        /* renamed from: a */
        public final int f33712a;

        /* renamed from: b */
        @Nullable
        public final String f33713b;

        /* renamed from: c */
        @Nullable
        public final String f33714c;

        /* renamed from: d */
        public int f33715d;

        /* renamed from: e */
        public int f33716e;

        /* compiled from: ComparisonFailure.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/yandex/div/internal/ComparisonFailure$ComparisonCompactor$Companion;", "", "", "DELTA_END", "Ljava/lang/String;", "DELTA_START", "ELLIPSIS", "assertion_release"}, m31885k = 1, m31886mv = {1, 5, 1})
        public static final class Companion {
        }

        public ComparisonCompactor(int i2, @Nullable String str, @Nullable String str2) {
            this.f33712a = i2;
            this.f33713b = str;
            this.f33714c = str2;
        }

        /* renamed from: a */
        public final String m17301a(String str) {
            StringBuilder m2872a = C0321a.m2872a('[');
            String substring = str.substring(this.f33715d, (str.length() - this.f33716e) + 1);
            Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            m2872a.append(substring);
            m2872a.append(']');
            String sb = m2872a.toString();
            int i2 = this.f33715d;
            if (i2 > 0) {
                String str2 = i2 > this.f33712a ? "..." : "";
                String str3 = this.f33713b;
                Intrinsics.m32176e(str3);
                String substring2 = str3.substring(Math.max(0, this.f33715d - this.f33712a), this.f33715d);
                Intrinsics.m32178g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb = Intrinsics.m32187p(Intrinsics.m32187p(str2, substring2), sb);
            }
            if (this.f33716e <= 0) {
                return sb;
            }
            String str4 = this.f33713b;
            Intrinsics.m32176e(str4);
            int min = Math.min((str4.length() - this.f33716e) + 1 + this.f33712a, this.f33713b.length());
            String str5 = (this.f33713b.length() - this.f33716e) + 1 >= this.f33713b.length() - this.f33712a ? "" : "...";
            String str6 = this.f33713b;
            String substring3 = str6.substring((str6.length() - this.f33716e) + 1, min);
            Intrinsics.m32178g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
            return Intrinsics.m32187p(sb, Intrinsics.m32187p(substring3, str5));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComparisonFailure(@Nullable String str, @NotNull String expected, @NotNull String actual) {
        super(str);
        Intrinsics.m32179h(expected, "expected");
        Intrinsics.m32179h(actual, "actual");
        this.f33710b = expected;
        this.f33711c = actual;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        String str = this.f33710b;
        String str2 = this.f33711c;
        ComparisonCompactor comparisonCompactor = new ComparisonCompactor(20, str, str2);
        String message = super.getMessage();
        if (str == null || str2 == null || Intrinsics.m32174c(str, str2)) {
            String m17299c = Assert.m17299c(message, str, str2);
            Intrinsics.m32178g(m17299c, "format(message, expected, actual)");
            return m17299c;
        }
        comparisonCompactor.f33715d = 0;
        Intrinsics.m32176e(str);
        int length = str.length();
        Intrinsics.m32176e(str2);
        int min = Math.min(length, str2.length());
        while (true) {
            int i2 = comparisonCompactor.f33715d;
            if (i2 >= min || comparisonCompactor.f33713b.charAt(i2) != comparisonCompactor.f33714c.charAt(comparisonCompactor.f33715d)) {
                break;
            }
            comparisonCompactor.f33715d++;
        }
        String str3 = comparisonCompactor.f33713b;
        Intrinsics.m32176e(str3);
        int length2 = str3.length() - 1;
        String str4 = comparisonCompactor.f33714c;
        Intrinsics.m32176e(str4);
        int length3 = str4.length() - 1;
        while (true) {
            int i3 = comparisonCompactor.f33715d;
            if (length3 < i3 || length2 < i3 || comparisonCompactor.f33713b.charAt(length2) != comparisonCompactor.f33714c.charAt(length3)) {
                break;
            }
            length3--;
            length2--;
        }
        comparisonCompactor.f33716e = comparisonCompactor.f33713b.length() - length2;
        String m17299c2 = Assert.m17299c(message, comparisonCompactor.m17301a(comparisonCompactor.f33713b), comparisonCompactor.m17301a(comparisonCompactor.f33714c));
        Intrinsics.m32178g(m17299c2, "format(message, expected, actual)");
        return m17299c2;
    }
}
