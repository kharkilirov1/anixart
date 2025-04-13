package com.google.firebase.firestore.local;

import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.proto.Target;

/* loaded from: classes2.dex */
public final class LocalSerializer {

    /* renamed from: com.google.firebase.firestore.local.LocalSerializer$1 */
    public static /* synthetic */ class C20941 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22784a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22785b;

        static {
            int[] iArr = new int[Target.TargetTypeCase.values().length];
            f22785b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22785b[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[MaybeDocument.DocumentTypeCase.values().length];
            f22784a = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22784a[0] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22784a[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }
}
