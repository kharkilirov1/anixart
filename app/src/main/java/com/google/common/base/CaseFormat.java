package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@GwtCompatible
/* loaded from: classes.dex */
public abstract class CaseFormat {

    /* renamed from: d */
    public static final CaseFormat f20472d;

    /* renamed from: e */
    public static final CaseFormat f20473e;

    /* renamed from: f */
    public static final CaseFormat f20474f;

    /* renamed from: g */
    public static final CaseFormat f20475g;

    /* renamed from: h */
    public static final CaseFormat f20476h;

    /* renamed from: i */
    public static final /* synthetic */ CaseFormat[] f20477i;

    /* renamed from: b */
    public final CharMatcher f20478b;

    /* renamed from: c */
    public final String f20479c;

    public static final class StringConverter extends Converter<String, String> implements Serializable {
        @Override // com.google.common.base.Converter
        /* renamed from: b */
        public String mo11126b(String str) {
            throw null;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            java.util.Objects.requireNonNull((StringConverter) obj);
            throw null;
        }

        public int hashCode() {
            throw null;
        }

        public String toString() {
            return "null.converterTo(null)";
        }
    }

    static {
        CaseFormat caseFormat = new CaseFormat("LOWER_HYPHEN", 0, new CharMatcher.C1556Is('-'), "-") { // from class: com.google.common.base.CaseFormat.1
        };
        f20472d = caseFormat;
        String str = "_";
        CaseFormat caseFormat2 = new CaseFormat("LOWER_UNDERSCORE", 1, new CharMatcher.C1556Is('_'), str) { // from class: com.google.common.base.CaseFormat.2
        };
        f20473e = caseFormat2;
        String str2 = "";
        CaseFormat caseFormat3 = new CaseFormat("LOWER_CAMEL", 2, new CharMatcher.InRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.3
        };
        f20474f = caseFormat3;
        CaseFormat caseFormat4 = new CaseFormat("UPPER_CAMEL", 3, new CharMatcher.InRange('A', 'Z'), str2) { // from class: com.google.common.base.CaseFormat.4
        };
        f20475g = caseFormat4;
        CaseFormat caseFormat5 = new CaseFormat("UPPER_UNDERSCORE", 4, new CharMatcher.C1556Is('_'), str) { // from class: com.google.common.base.CaseFormat.5
        };
        f20476h = caseFormat5;
        f20477i = new CaseFormat[]{caseFormat, caseFormat2, caseFormat3, caseFormat4, caseFormat5};
    }

    public CaseFormat(String str, int i2, CharMatcher charMatcher, String str2, C15501 c15501) {
        this.f20478b = charMatcher;
        this.f20479c = str2;
    }

    public static CaseFormat valueOf(String str) {
        return (CaseFormat) Enum.valueOf(CaseFormat.class, str);
    }

    public static CaseFormat[] values() {
        return (CaseFormat[]) f20477i.clone();
    }
}
