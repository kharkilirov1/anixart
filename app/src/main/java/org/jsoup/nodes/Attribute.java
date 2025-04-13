package org.jsoup.nodes;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;

/* loaded from: classes3.dex */
public class Attribute implements Map.Entry<String, String>, Cloneable {

    /* renamed from: e */
    public static final String[] f68944e = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: f */
    public static final Pattern f68945f = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* renamed from: g */
    public static final Pattern f68946g = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* renamed from: h */
    public static final Pattern f68947h = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: i */
    public static final Pattern f68948i = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* renamed from: b */
    public String f68949b;

    /* renamed from: c */
    @Nullable
    public String f68950c;

    /* renamed from: d */
    @Nullable
    public Attributes f68951d;

    public Attribute(String str, @Nullable String str2, @Nullable Attributes attributes) {
        Validate.m34694g(str);
        String trim = str.trim();
        Validate.m34692e(trim);
        this.f68949b = trim;
        this.f68950c = str2;
        this.f68951d = attributes;
    }

    @Nullable
    /* renamed from: a */
    public static String m34708a(String str, Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml) {
            Pattern pattern = f68945f;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f68946g.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (syntax == Document.OutputSettings.Syntax.html) {
            Pattern pattern2 = f68947h;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = f68948i.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ((java.util.Arrays.binarySearch(org.jsoup.nodes.Attribute.f68944e, org.jsoup.internal.Normalizer.m34697a(r7)) >= 0) != false) goto L14;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m34709c(java.lang.String r7, @javax.annotation.Nullable java.lang.String r8, java.lang.Appendable r9, org.jsoup.nodes.Document.OutputSettings r10) throws java.io.IOException {
        /*
            r9.append(r7)
            org.jsoup.nodes.Document$OutputSettings$Syntax r0 = r10.f68971i
            org.jsoup.nodes.Document$OutputSettings$Syntax r1 = org.jsoup.nodes.Document.OutputSettings.Syntax.html
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L2b
            if (r8 == 0) goto L2a
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L19
            boolean r0 = r8.equalsIgnoreCase(r7)
            if (r0 == 0) goto L2b
        L19:
            java.lang.String[] r0 = org.jsoup.nodes.Attribute.f68944e
            java.lang.String r7 = org.jsoup.internal.Normalizer.m34697a(r7)
            int r7 = java.util.Arrays.binarySearch(r0, r7)
            if (r7 < 0) goto L27
            r7 = 1
            goto L28
        L27:
            r7 = 0
        L28:
            if (r7 == 0) goto L2b
        L2a:
            r2 = 1
        L2b:
            if (r2 != 0) goto L44
            java.lang.String r7 = "=\""
            r9.append(r7)
            java.lang.String r1 = org.jsoup.nodes.Attributes.m34713e(r8)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r2 = r10
            org.jsoup.nodes.Entities.m34776b(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Attribute.m34709c(java.lang.String, java.lang.String, java.lang.Appendable, org.jsoup.nodes.Document$OutputSettings):void");
    }

    @Override // java.util.Map.Entry
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String getValue() {
        return Attributes.m34713e(this.f68950c);
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public String setValue(@Nullable String str) {
        int m34728y;
        String str2 = this.f68950c;
        Attributes attributes = this.f68951d;
        if (attributes != null && (m34728y = attributes.m34728y(this.f68949b)) != -1) {
            str2 = this.f68951d.m34723r(this.f68949b);
            this.f68951d.f68954d[m34728y] = str;
        }
        this.f68950c = str;
        return Attributes.m34713e(str2);
    }

    @Override // java.util.Map.Entry
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.f68949b;
        if (str == null ? attribute.f68949b != null : !str.equals(attribute.f68949b)) {
            return false;
        }
        String str2 = this.f68950c;
        String str3 = attribute.f68950c;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.util.Map.Entry
    public String getKey() {
        return this.f68949b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        String str = this.f68949b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f68950c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m34700b = StringUtil.m34700b();
        try {
            Document.OutputSettings outputSettings = new Document("").f68960k;
            String str = this.f68949b;
            String str2 = this.f68950c;
            String m34708a = m34708a(str, outputSettings.f68971i);
            if (m34708a != null) {
                m34709c(m34708a, str2, m34700b, outputSettings);
            }
            return StringUtil.m34705g(m34700b);
        } catch (IOException e2) {
            throw new SerializationException(e2);
        }
    }
}
