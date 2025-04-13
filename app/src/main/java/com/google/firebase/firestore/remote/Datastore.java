package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.FirestoreChannel;
import com.google.firestore.p012v1.BatchGetDocumentsResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class Datastore {

    /* renamed from: a */
    public static final Set<String> f22927a = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: com.google.firebase.firestore.remote.Datastore$1 */
    class C21171 extends FirestoreChannel.StreamingListener<BatchGetDocumentsResponse> {
    }

    /* renamed from: com.google.firebase.firestore.remote.Datastore$2 */
    public static /* synthetic */ class C21182 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22928a;

        static {
            int[] iArr = new int[FirebaseFirestoreException.Code.values().length];
            f22928a = iArr;
            try {
                FirebaseFirestoreException.Code code = FirebaseFirestoreException.Code.OK;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f22928a;
                FirebaseFirestoreException.Code code2 = FirebaseFirestoreException.Code.CANCELLED;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f22928a;
                FirebaseFirestoreException.Code code3 = FirebaseFirestoreException.Code.UNKNOWN;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f22928a;
                FirebaseFirestoreException.Code code4 = FirebaseFirestoreException.Code.DEADLINE_EXCEEDED;
                iArr4[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f22928a;
                FirebaseFirestoreException.Code code5 = FirebaseFirestoreException.Code.RESOURCE_EXHAUSTED;
                iArr5[8] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f22928a;
                FirebaseFirestoreException.Code code6 = FirebaseFirestoreException.Code.INTERNAL;
                iArr6[13] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f22928a;
                FirebaseFirestoreException.Code code7 = FirebaseFirestoreException.Code.UNAVAILABLE;
                iArr7[14] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f22928a;
                FirebaseFirestoreException.Code code8 = FirebaseFirestoreException.Code.UNAUTHENTICATED;
                iArr8[16] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f22928a;
                FirebaseFirestoreException.Code code9 = FirebaseFirestoreException.Code.INVALID_ARGUMENT;
                iArr9[3] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = f22928a;
                FirebaseFirestoreException.Code code10 = FirebaseFirestoreException.Code.NOT_FOUND;
                iArr10[5] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                int[] iArr11 = f22928a;
                FirebaseFirestoreException.Code code11 = FirebaseFirestoreException.Code.ALREADY_EXISTS;
                iArr11[6] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = f22928a;
                FirebaseFirestoreException.Code code12 = FirebaseFirestoreException.Code.PERMISSION_DENIED;
                iArr12[7] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = f22928a;
                FirebaseFirestoreException.Code code13 = FirebaseFirestoreException.Code.FAILED_PRECONDITION;
                iArr13[9] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = f22928a;
                FirebaseFirestoreException.Code code14 = FirebaseFirestoreException.Code.ABORTED;
                iArr14[10] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = f22928a;
                FirebaseFirestoreException.Code code15 = FirebaseFirestoreException.Code.OUT_OF_RANGE;
                iArr15[11] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                int[] iArr16 = f22928a;
                FirebaseFirestoreException.Code code16 = FirebaseFirestoreException.Code.UNIMPLEMENTED;
                iArr16[12] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                int[] iArr17 = f22928a;
                FirebaseFirestoreException.Code code17 = FirebaseFirestoreException.Code.DATA_LOSS;
                iArr17[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }
}
