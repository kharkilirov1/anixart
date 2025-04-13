package com.yandex.div.evaluable.internal;

import androidx.room.util.C0576a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import com.yandex.div.evaluable.internal.Token;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Tokenizer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Tokenizer;", "", "TokenizationState", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Tokenizer {

    /* renamed from: a */
    @NotNull
    public static final Tokenizer f33636a = new Tokenizer();

    /* renamed from: b */
    @NotNull
    public static final String[] f33637b = {"'", "@{"};

    /* compiled from: Tokenizer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/internal/Tokenizer$TokenizationState;", "", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final /* data */ class TokenizationState {

        /* renamed from: a */
        @NotNull
        public final String f33638a;

        /* renamed from: b */
        public int f33639b;

        /* renamed from: c */
        @NotNull
        public final List<Token> f33640c = new ArrayList();

        public TokenizationState(@NotNull String str) {
            this.f33638a = str;
        }

        /* renamed from: c */
        public static char m17267c(TokenizationState tokenizationState, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i2 = 1;
            }
            if (tokenizationState.f33639b + i2 >= tokenizationState.f33638a.length()) {
                return (char) 0;
            }
            return tokenizationState.f33638a.charAt(tokenizationState.f33639b + i2);
        }

        /* renamed from: e */
        public static char m17268e(TokenizationState tokenizationState, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i2 = 1;
            }
            int i4 = tokenizationState.f33639b - i2;
            if (i4 >= 0) {
                return tokenizationState.f33638a.charAt(i4);
            }
            return (char) 0;
        }

        /* renamed from: a */
        public final char m17269a() {
            if (this.f33639b >= this.f33638a.length()) {
                return (char) 0;
            }
            return this.f33638a.charAt(this.f33639b);
        }

        /* renamed from: b */
        public final int m17270b(int i2) {
            int i3 = this.f33639b;
            this.f33639b = i2 + i3;
            return i3;
        }

        @NotNull
        /* renamed from: d */
        public final String m17271d(int i2, int i3) {
            String substring = this.f33638a.substring(i2, i3);
            Intrinsics.m32178g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TokenizationState) && Intrinsics.m32174c(this.f33638a, ((TokenizationState) obj).f33638a);
        }

        public int hashCode() {
            return this.f33638a.hashCode();
        }

        @NotNull
        public String toString() {
            return C0576a.m4118q(C0000a.m24u("TokenizationState(source="), this.f33638a, ')');
        }
    }

    /* renamed from: a */
    public final EvaluableException m17256a(TokenizationState tokenizationState) {
        StringBuilder m24u = C0000a.m24u("Invalid token '");
        m24u.append(tokenizationState.m17269a());
        m24u.append("' at position ");
        m24u.append(tokenizationState.f33639b);
        return new EvaluableException(m24u.toString(), null);
    }

    /* renamed from: b */
    public final boolean m17257b(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        return ('A' <= c2 && c2 < '[') || c2 == '_';
    }

    /* renamed from: c */
    public final boolean m17258c(char c2) {
        return c2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17259d(char r6, com.yandex.div.evaluable.internal.Tokenizer.TokenizationState r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            r2 = 39
            if (r6 != r2) goto L30
            int r6 = r7.f33639b
            java.lang.String r2 = r7.f33638a
            int r2 = r2.length()
            if (r6 < r2) goto L11
            goto L2c
        L11:
            int r6 = r7.f33639b
            int r6 = r6 - r1
            r2 = 0
        L15:
            if (r6 <= 0) goto L26
            java.lang.String r3 = r7.f33638a
            char r3 = r3.charAt(r6)
            r4 = 92
            if (r3 != r4) goto L26
            int r2 = r2 + 1
            int r6 = r6 + (-1)
            goto L15
        L26:
            int r2 = r2 % 2
            if (r2 != r1) goto L2c
            r6 = 1
            goto L2d
        L2c:
            r6 = 0
        L2d:
            if (r6 != 0) goto L30
            r0 = 1
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.internal.Tokenizer.m17259d(char, com.yandex.div.evaluable.internal.Tokenizer$TokenizationState):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r10 == '-') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r9 == 'E') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        if (java.lang.Character.isDigit(r10) != false) goto L21;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m17260e(char r8, char r9, char r10) {
        /*
            r7 = this;
            boolean r0 = java.lang.Character.isDigit(r8)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L4e
            r0 = 46
            if (r8 != r0) goto L11
            boolean r8 = java.lang.Character.isDigit(r10)
            goto L4c
        L11:
            r0 = 69
            r3 = 101(0x65, float:1.42E-43)
            if (r8 != r3) goto L19
        L17:
            r4 = 1
            goto L1d
        L19:
            if (r8 != r0) goto L1c
            goto L17
        L1c:
            r4 = 0
        L1d:
            r5 = 45
            r6 = 43
            if (r4 == 0) goto L37
            boolean r8 = java.lang.Character.isDigit(r9)
            if (r8 == 0) goto L35
            boolean r8 = java.lang.Character.isDigit(r10)
            if (r8 != 0) goto L33
            if (r10 == r6) goto L33
            if (r10 != r5) goto L35
        L33:
            r8 = 1
            goto L4c
        L35:
            r8 = 0
            goto L4c
        L37:
            if (r8 != r6) goto L3b
        L39:
            r8 = 1
            goto L3f
        L3b:
            if (r8 != r5) goto L3e
            goto L39
        L3e:
            r8 = 0
        L3f:
            if (r8 == 0) goto L35
            if (r9 == r3) goto L45
            if (r9 != r0) goto L35
        L45:
            boolean r8 = java.lang.Character.isDigit(r10)
            if (r8 == 0) goto L35
            goto L33
        L4c:
            if (r8 == 0) goto L4f
        L4e:
            r1 = 1
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.internal.Tokenizer.m17260e(char, char, char):boolean");
    }

    /* renamed from: f */
    public final boolean m17261f(List<? extends Token> list) {
        if (list.isEmpty() || (CollectionsKt.m31991D(list) instanceof Token.Operator.Unary)) {
            return false;
        }
        return (CollectionsKt.m31991D(list) instanceof Token.Operand) || (CollectionsKt.m31991D(list) instanceof Token.Bracket.RightRound);
    }

    /* renamed from: g */
    public final boolean m17262g(char c2, TokenizationState tokenizationState) {
        return c2 == '@' && TokenizationState.m17268e(tokenizationState, 0, 1) != '\\' && TokenizationState.m17267c(tokenizationState, 0, 1) == '{';
    }

    /* renamed from: h */
    public final boolean m17263h(List<? extends Token> list) {
        return (m17261f(list) || (CollectionsKt.m31992E(list) instanceof Token.Operator.Unary)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        if (r6.length() != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d9, code lost:
    
        r1 = false;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m17264i(com.yandex.div.evaluable.internal.Tokenizer.TokenizationState r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.internal.Tokenizer.m17264i(com.yandex.div.evaluable.internal.Tokenizer$TokenizationState, boolean):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x034e A[LOOP:4: B:171:0x0331->B:181:0x034e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0352 A[EDGE_INSN: B:182:0x0352->B:183:0x0352 BREAK  A[LOOP:4: B:171:0x0331->B:181:0x034e], SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17265j(com.yandex.div.evaluable.internal.Tokenizer.TokenizationState r18, java.util.List<com.yandex.div.evaluable.internal.Token> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1115
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.evaluable.internal.Tokenizer.m17265j(com.yandex.div.evaluable.internal.Tokenizer$TokenizationState, java.util.List, boolean):void");
    }

    @NotNull
    /* renamed from: k */
    public final List<Token> m17266k(@NotNull String str) {
        TokenizationState tokenizationState = new TokenizationState(str);
        try {
            m17265j(tokenizationState, tokenizationState.f33640c, false);
            return tokenizationState.f33640c;
        } catch (EvaluableException e2) {
            if (e2 instanceof TokenizingException) {
                throw new EvaluableException(C0000a.m16m("Error tokenizing '", str, "'."), e2);
            }
            throw e2;
        }
    }
}
