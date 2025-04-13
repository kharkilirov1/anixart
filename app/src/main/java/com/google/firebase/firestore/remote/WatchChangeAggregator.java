package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.WatchChange;

/* loaded from: classes2.dex */
public class WatchChangeAggregator {

    /* renamed from: com.google.firebase.firestore.remote.WatchChangeAggregator$1 */
    public static /* synthetic */ class C21281 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22997a;

        static {
            int[] iArr = new int[WatchChange.WatchTargetChangeType.values().length];
            f22997a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22997a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22997a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22997a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22997a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface TargetMetadataProvider {
    }
}
