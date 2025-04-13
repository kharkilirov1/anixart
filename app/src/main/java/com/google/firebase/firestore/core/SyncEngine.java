package com.google.firebase.firestore.core;

import com.google.firebase.firestore.core.LimboDocumentChange;
import com.google.firebase.firestore.remote.RemoteStore;

/* loaded from: classes2.dex */
public class SyncEngine implements RemoteStore.RemoteStoreCallback {

    /* renamed from: com.google.firebase.firestore.core.SyncEngine$1 */
    public static /* synthetic */ class C20881 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22741a;

        static {
            int[] iArr = new int[LimboDocumentChange.Type.values().length];
            f22741a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22741a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class LimboResolution {
    }

    public interface SyncEngineCallback {
    }
}
