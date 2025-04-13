package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_NetworkConnectionInfo;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class NetworkConnectionInfo {

    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        public abstract NetworkConnectionInfo mo5475a();

        @NonNull
        /* renamed from: b */
        public abstract Builder mo5476b(@Nullable MobileSubtype mobileSubtype);

        @NonNull
        /* renamed from: c */
        public abstract Builder mo5477c(@Nullable NetworkType networkType);
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype, still in use, count: 1, list:
      (r1v1 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype) from 0x0127: INVOKE 
      (r2v11 android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype>)
      (1 int)
      (r1v1 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$MobileSubtype)
     VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:25)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class MobileSubtype {
        UNKNOWN_MOBILE_SUBTYPE(0),
        /* JADX INFO: Fake field, exist only in values array */
        GPRS(1),
        /* JADX INFO: Fake field, exist only in values array */
        EDGE(2),
        /* JADX INFO: Fake field, exist only in values array */
        UMTS(3),
        /* JADX INFO: Fake field, exist only in values array */
        CDMA(4),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_0(5),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_A(6),
        /* JADX INFO: Fake field, exist only in values array */
        RTT(7),
        /* JADX INFO: Fake field, exist only in values array */
        HSDPA(8),
        /* JADX INFO: Fake field, exist only in values array */
        HSUPA(9),
        /* JADX INFO: Fake field, exist only in values array */
        HSPA(10),
        /* JADX INFO: Fake field, exist only in values array */
        IDEN(11),
        /* JADX INFO: Fake field, exist only in values array */
        EVDO_B(12),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(13),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(14),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(15),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(16),
        /* JADX INFO: Fake field, exist only in values array */
        TD_SCDMA(17),
        /* JADX INFO: Fake field, exist only in values array */
        IWLAN(18),
        /* JADX INFO: Fake field, exist only in values array */
        LTE_CA(19),
        COMBINED(100);


        /* renamed from: e */
        public static final SparseArray<MobileSubtype> f9078e;

        /* renamed from: b */
        public final int f9080b;

        static {
            MobileSubtype mobileSubtype = UNKNOWN_MOBILE_SUBTYPE;
            SparseArray<MobileSubtype> sparseArray = new SparseArray<>();
            f9078e = sparseArray;
            sparseArray.put(0, mobileSubtype);
            sparseArray.put(1, r1);
            sparseArray.put(2, r3);
            sparseArray.put(3, r5);
            sparseArray.put(4, r7);
            sparseArray.put(5, r9);
            sparseArray.put(6, r11);
            sparseArray.put(7, r13);
            sparseArray.put(8, r15);
            sparseArray.put(9, r14);
            sparseArray.put(10, r12);
            sparseArray.put(11, r10);
            sparseArray.put(12, r8);
            sparseArray.put(13, r6);
            sparseArray.put(14, r4);
            sparseArray.put(15, r2);
            sparseArray.put(16, r6);
            sparseArray.put(17, r4);
            sparseArray.put(18, r2);
            sparseArray.put(19, r6);
        }

        public MobileSubtype(int i2) {
            this.f9080b = i2;
        }

        public static MobileSubtype valueOf(String str) {
            return (MobileSubtype) Enum.valueOf(MobileSubtype.class, str);
        }

        public static MobileSubtype[] values() {
            return (MobileSubtype[]) f9079f.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType, still in use, count: 1, list:
      (r0v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType) from 0x010a: INVOKE 
      (r4v8 android.util.SparseArray<com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType>)
      (0 int)
      (r0v0 com.google.android.datatransport.cct.internal.NetworkConnectionInfo$NetworkType)
     VIRTUAL call: android.util.SparseArray.put(int, java.lang.Object):void A[MD:(int, E):void (c)] (LINE:22)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class NetworkType {
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE(0),
        /* JADX INFO: Fake field, exist only in values array */
        WIFI(1),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_MMS(2),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_SUPL(3),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_DUN(4),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_HIPRI(5),
        /* JADX INFO: Fake field, exist only in values array */
        WIMAX(6),
        /* JADX INFO: Fake field, exist only in values array */
        BLUETOOTH(7),
        /* JADX INFO: Fake field, exist only in values array */
        DUMMY(8),
        /* JADX INFO: Fake field, exist only in values array */
        ETHERNET(9),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_FOTA(10),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_IMS(11),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_CBS(12),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(13),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(14),
        /* JADX INFO: Fake field, exist only in values array */
        MOBILE_EMERGENCY(15),
        /* JADX INFO: Fake field, exist only in values array */
        PROXY(16),
        /* JADX INFO: Fake field, exist only in values array */
        VPN(17),
        NONE(-1);


        /* renamed from: d */
        public static final SparseArray<NetworkType> f9082d;

        /* renamed from: b */
        public final int f9084b;

        static {
            NetworkType networkType = NONE;
            SparseArray<NetworkType> sparseArray = new SparseArray<>();
            f9082d = sparseArray;
            sparseArray.put(0, r0);
            sparseArray.put(1, r1);
            sparseArray.put(2, r3);
            sparseArray.put(3, r5);
            sparseArray.put(4, r7);
            sparseArray.put(5, r9);
            sparseArray.put(6, r11);
            sparseArray.put(7, r13);
            sparseArray.put(8, r15);
            sparseArray.put(9, r14);
            sparseArray.put(10, r12);
            sparseArray.put(11, r10);
            sparseArray.put(12, r8);
            sparseArray.put(13, r6);
            sparseArray.put(14, r4);
            sparseArray.put(15, r2);
            sparseArray.put(16, r6);
            sparseArray.put(17, r4);
            sparseArray.put(-1, networkType);
        }

        public NetworkType(int i2) {
            this.f9084b = i2;
        }

        public static NetworkType valueOf(String str) {
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        public static NetworkType[] values() {
            return (NetworkType[]) f9083e.clone();
        }
    }

    @NonNull
    /* renamed from: a */
    public static Builder m5484a() {
        return new AutoValue_NetworkConnectionInfo.Builder();
    }

    @Nullable
    /* renamed from: b */
    public abstract MobileSubtype mo5473b();

    @Nullable
    /* renamed from: c */
    public abstract NetworkType mo5474c();
}
