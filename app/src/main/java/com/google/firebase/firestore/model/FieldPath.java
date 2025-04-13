package com.google.firebase.firestore.model;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class FieldPath extends BasePath<FieldPath> {

    /* renamed from: c */
    public static final FieldPath f22858c = new FieldPath(Collections.singletonList("__name__"));

    /* renamed from: d */
    public static final FieldPath f22859d = new FieldPath(Collections.emptyList());

    public FieldPath(List<String> list) {
        super(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087 A[SYNTHETIC] */
    @Override // com.google.firebase.firestore.model.BasePath
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String mo12428b() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            java.util.List<java.lang.String> r3 = r13.f22843b
            int r3 = r3.size()
            if (r2 >= r3) goto L8e
            if (r2 <= 0) goto L16
            java.lang.String r3 = "."
            r0.append(r3)
        L16:
            java.util.List<java.lang.String> r3 = r13.f22843b
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "\\"
            java.lang.String r5 = "\\\\"
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r4 = "`"
            java.lang.String r5 = "\\`"
            java.lang.String r3 = r3.replace(r4, r5)
            boolean r4 = r3.isEmpty()
            r5 = 1
            if (r4 == 0) goto L37
        L35:
            r5 = 0
            goto L71
        L37:
            char r4 = r3.charAt(r1)
            r6 = 90
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 65
            r9 = 97
            r10 = 95
            if (r4 == r10) goto L50
            if (r4 < r9) goto L4b
            if (r4 <= r7) goto L50
        L4b:
            if (r4 < r8) goto L35
            if (r4 <= r6) goto L50
            goto L35
        L50:
            r4 = 1
        L51:
            int r11 = r3.length()
            if (r4 >= r11) goto L71
            char r11 = r3.charAt(r4)
            if (r11 == r10) goto L6e
            if (r11 < r9) goto L61
            if (r11 <= r7) goto L6e
        L61:
            if (r11 < r8) goto L65
            if (r11 <= r6) goto L6e
        L65:
            r12 = 48
            if (r11 < r12) goto L35
            r12 = 57
            if (r11 <= r12) goto L6e
            goto L35
        L6e:
            int r4 = r4 + 1
            goto L51
        L71:
            if (r5 != 0) goto L87
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 96
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
        L87:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L8e:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.model.FieldPath.mo12428b():java.lang.String");
    }

    @Override // com.google.firebase.firestore.model.BasePath
    /* renamed from: d */
    public FieldPath mo12430d(List list) {
        return new FieldPath(list);
    }

    /* renamed from: l */
    public boolean m12447l() {
        return equals(f22858c);
    }
}
