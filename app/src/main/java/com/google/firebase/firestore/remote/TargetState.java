package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.protobuf.ByteString;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class TargetState {

    /* renamed from: a */
    public int f22975a = 0;

    /* renamed from: b */
    public final Map<DocumentKey, DocumentViewChange.Type> f22976b = new HashMap();

    /* renamed from: c */
    public boolean f22977c = true;

    /* renamed from: d */
    public ByteString f22978d = ByteString.f23981c;

    /* renamed from: e */
    public boolean f22979e = false;

    /* renamed from: com.google.firebase.firestore.remote.TargetState$1 */
    public static /* synthetic */ class C21261 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22980a;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f22980a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22980a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22980a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
