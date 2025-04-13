package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.CompositeFilter;
import com.google.firebase.firestore.core.FieldFilter;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firestore.p012v1.DocumentTransform;
import com.google.firestore.p012v1.ListenResponse;
import com.google.firestore.p012v1.Precondition;
import com.google.firestore.p012v1.StructuredQuery;
import com.google.firestore.p012v1.TargetChange;
import com.google.firestore.p012v1.Write;

/* loaded from: classes2.dex */
public final class RemoteSerializer {

    /* renamed from: com.google.firebase.firestore.remote.RemoteSerializer$1 */
    public static /* synthetic */ class C21231 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22952a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f22953b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f22954c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f22955d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f22956e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f22957f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f22958g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f22959h;

        /* renamed from: i */
        public static final /* synthetic */ int[] f22960i;

        /* renamed from: j */
        public static final /* synthetic */ int[] f22961j;

        /* renamed from: k */
        public static final /* synthetic */ int[] f22962k;

        /* renamed from: l */
        public static final /* synthetic */ int[] f22963l;

        /* renamed from: m */
        public static final /* synthetic */ int[] f22964m;

        static {
            int[] iArr = new int[ListenResponse.ResponseTypeCase.values().length];
            f22964m = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22964m[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22964m[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22964m[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22964m[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22964m[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[TargetChange.TargetChangeType.values().length];
            f22963l = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f22963l[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f22963l[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f22963l[3] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f22963l[4] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f22963l[5] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[StructuredQuery.Direction.values().length];
            f22962k = iArr3;
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f22962k[2] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr4 = new int[StructuredQuery.FieldFilter.Operator.values().length];
            f22961j = iArr4;
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f22961j[2] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f22961j[5] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f22961j[6] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f22961j[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f22961j[3] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f22961j[7] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f22961j[8] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f22961j[9] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f22961j[10] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr5 = new int[FieldFilter.Operator.values().length];
            f22960i = iArr5;
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f22960i[1] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f22960i[2] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f22960i[3] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f22960i[4] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f22960i[5] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f22960i[6] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f22960i[8] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f22960i[7] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f22960i[9] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr6 = new int[StructuredQuery.UnaryFilter.Operator.values().length];
            f22959h = iArr6;
            try {
                iArr6[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f22959h[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f22959h[3] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f22959h[4] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] iArr7 = new int[StructuredQuery.Filter.FilterTypeCase.values().length];
            f22958g = iArr7;
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f22958g[1] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f22958g[2] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] iArr8 = new int[StructuredQuery.CompositeFilter.Operator.values().length];
            f22957f = iArr8;
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f22957f[0] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] iArr9 = new int[CompositeFilter.Operator.values().length];
            f22956e = iArr9;
            try {
                iArr9[0] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f22956e[1] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] iArr10 = new int[QueryPurpose.values().length];
            f22955d = iArr10;
            try {
                iArr10[0] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f22955d[1] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f22955d[2] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            int[] iArr11 = new int[DocumentTransform.FieldTransform.TransformTypeCase.values().length];
            f22954c = iArr11;
            try {
                iArr11[0] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f22954c[4] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f22954c[5] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f22954c[1] = 4;
            } catch (NoSuchFieldError unused52) {
            }
            int[] iArr12 = new int[Precondition.ConditionTypeCase.values().length];
            f22953b = iArr12;
            try {
                iArr12[1] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f22953b[0] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f22953b[2] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            int[] iArr13 = new int[Write.OperationCase.values().length];
            f22952a = iArr13;
            try {
                iArr13[0] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f22952a[1] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f22952a[2] = 3;
            } catch (NoSuchFieldError unused58) {
            }
        }
    }
}
