package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4083kh;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.X3 */
/* loaded from: classes2.dex */
public class C3734X3 {

    /* renamed from: a */
    public final C4083kh.b f44441a;

    /* renamed from: b */
    public final a f44442b;

    /* renamed from: c */
    @Nullable
    public final ResultReceiver f44443c;

    /* renamed from: com.yandex.metrica.impl.ob.X3$a */
    public static class a implements InterfaceC3875ch<a, a> {

        /* renamed from: a */
        @Nullable
        public final String f44444a;

        /* renamed from: b */
        @Nullable
        public final String f44445b;

        /* renamed from: c */
        @Nullable
        public final String f44446c;

        /* renamed from: d */
        @Nullable
        public final String f44447d;

        /* renamed from: e */
        @Nullable
        public final Boolean f44448e;

        /* renamed from: f */
        @Nullable
        public final Location f44449f;

        /* renamed from: g */
        @Nullable
        public final Boolean f44450g;

        /* renamed from: h */
        @Nullable
        public final Integer f44451h;

        /* renamed from: i */
        @Nullable
        public final Integer f44452i;

        /* renamed from: j */
        @Nullable
        public final Integer f44453j;

        /* renamed from: k */
        @Nullable
        public final Boolean f44454k;

        /* renamed from: l */
        @Nullable
        public final Boolean f44455l;

        /* renamed from: m */
        @Nullable
        public final Map<String, String> f44456m;

        /* renamed from: n */
        @Nullable
        public final Integer f44457n;

        /* renamed from: o */
        @Nullable
        public final Boolean f44458o;

        /* renamed from: p */
        @Nullable
        public final Boolean f44459p;

        /* renamed from: q */
        @Nullable
        public final Boolean f44460q;

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable Location location, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Map<String, String> map, @Nullable Integer num4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Boolean bool7) {
            this.f44444a = str;
            this.f44445b = str2;
            this.f44446c = str3;
            this.f44447d = str4;
            this.f44448e = bool;
            this.f44449f = location;
            this.f44450g = bool2;
            this.f44451h = num;
            this.f44452i = num2;
            this.f44453j = num3;
            this.f44454k = bool3;
            this.f44455l = bool4;
            this.f44456m = map;
            this.f44457n = num4;
            this.f44458o = bool5;
            this.f44459p = bool6;
            this.f44460q = bool7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        /* renamed from: b */
        public boolean mo19382b(@NonNull a aVar) {
            return equals(aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            String str = this.f44444a;
            if (str == null ? aVar.f44444a != null : !str.equals(aVar.f44444a)) {
                return false;
            }
            String str2 = this.f44445b;
            if (str2 == null ? aVar.f44445b != null : !str2.equals(aVar.f44445b)) {
                return false;
            }
            String str3 = this.f44446c;
            if (str3 == null ? aVar.f44446c != null : !str3.equals(aVar.f44446c)) {
                return false;
            }
            String str4 = this.f44447d;
            if (str4 == null ? aVar.f44447d != null : !str4.equals(aVar.f44447d)) {
                return false;
            }
            Boolean bool = this.f44448e;
            if (bool == null ? aVar.f44448e != null : !bool.equals(aVar.f44448e)) {
                return false;
            }
            Location location = this.f44449f;
            if (location == null ? aVar.f44449f != null : !location.equals(aVar.f44449f)) {
                return false;
            }
            Boolean bool2 = this.f44450g;
            if (bool2 == null ? aVar.f44450g != null : !bool2.equals(aVar.f44450g)) {
                return false;
            }
            Integer num = this.f44451h;
            if (num == null ? aVar.f44451h != null : !num.equals(aVar.f44451h)) {
                return false;
            }
            Integer num2 = this.f44452i;
            if (num2 == null ? aVar.f44452i != null : !num2.equals(aVar.f44452i)) {
                return false;
            }
            Integer num3 = this.f44453j;
            if (num3 == null ? aVar.f44453j != null : !num3.equals(aVar.f44453j)) {
                return false;
            }
            Boolean bool3 = this.f44454k;
            if (bool3 == null ? aVar.f44454k != null : !bool3.equals(aVar.f44454k)) {
                return false;
            }
            Boolean bool4 = this.f44455l;
            if (bool4 == null ? aVar.f44455l != null : !bool4.equals(aVar.f44455l)) {
                return false;
            }
            Map<String, String> map = this.f44456m;
            if (map == null ? aVar.f44456m != null : !map.equals(aVar.f44456m)) {
                return false;
            }
            Integer num4 = this.f44457n;
            if (num4 == null ? aVar.f44457n != null : !num4.equals(aVar.f44457n)) {
                return false;
            }
            Boolean bool5 = this.f44458o;
            if (bool5 == null ? aVar.f44458o != null : !bool5.equals(aVar.f44458o)) {
                return false;
            }
            Boolean bool6 = this.f44459p;
            if (bool6 == null ? aVar.f44459p != null : !bool6.equals(aVar.f44459p)) {
                return false;
            }
            Boolean bool7 = this.f44460q;
            return bool7 != null ? bool7.equals(aVar.f44460q) : aVar.f44460q == null;
        }

        public int hashCode() {
            String str = this.f44444a;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f44445b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f44446c;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f44447d;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            Boolean bool = this.f44448e;
            int hashCode5 = (hashCode4 + (bool != null ? bool.hashCode() : 0)) * 31;
            Location location = this.f44449f;
            int hashCode6 = (hashCode5 + (location != null ? location.hashCode() : 0)) * 31;
            Boolean bool2 = this.f44450g;
            int hashCode7 = (hashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Integer num = this.f44451h;
            int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.f44452i;
            int hashCode9 = (hashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f44453j;
            int hashCode10 = (hashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Boolean bool3 = this.f44454k;
            int hashCode11 = (hashCode10 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.f44455l;
            int hashCode12 = (hashCode11 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            Map<String, String> map = this.f44456m;
            int hashCode13 = (hashCode12 + (map != null ? map.hashCode() : 0)) * 31;
            Integer num4 = this.f44457n;
            int hashCode14 = (hashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Boolean bool5 = this.f44458o;
            int hashCode15 = (hashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.f44459p;
            int hashCode16 = (hashCode15 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
            Boolean bool7 = this.f44460q;
            return hashCode16 + (bool7 != null ? bool7.hashCode() : 0);
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3875ch
        @NonNull
        /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public a mo19381a(@NonNull a aVar) {
            String str = this.f44444a;
            String str2 = aVar.f44444a;
            if (str == null) {
                str = str2;
            }
            String str3 = this.f44445b;
            String str4 = aVar.f44445b;
            if (str3 == null) {
                str3 = str4;
            }
            String str5 = this.f44446c;
            String str6 = aVar.f44446c;
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = this.f44447d;
            String str8 = aVar.f44447d;
            if (str7 == null) {
                str7 = str8;
            }
            Boolean bool = this.f44448e;
            Boolean bool2 = aVar.f44448e;
            if (bool == null) {
                bool = bool2;
            }
            Location location = this.f44449f;
            Location location2 = aVar.f44449f;
            if (location == null) {
                location = location2;
            }
            Boolean bool3 = this.f44450g;
            Boolean bool4 = aVar.f44450g;
            if (bool3 == null) {
                bool3 = bool4;
            }
            Integer num = this.f44451h;
            Integer num2 = aVar.f44451h;
            if (num == null) {
                num = num2;
            }
            Integer num3 = this.f44452i;
            Integer num4 = aVar.f44452i;
            if (num3 == null) {
                num3 = num4;
            }
            Integer num5 = this.f44453j;
            Integer num6 = aVar.f44453j;
            if (num5 == null) {
                num5 = num6;
            }
            Boolean bool5 = this.f44454k;
            Boolean bool6 = aVar.f44454k;
            if (bool5 == null) {
                bool5 = bool6;
            }
            Boolean bool7 = this.f44455l;
            Boolean bool8 = aVar.f44455l;
            if (bool7 == null) {
                bool7 = bool8;
            }
            Map<String, String> map = this.f44456m;
            Map<String, String> map2 = aVar.f44456m;
            if (map == null) {
                map = map2;
            }
            Integer num7 = this.f44457n;
            Map<String, String> map3 = map;
            Integer num8 = aVar.f44457n;
            if (num7 == null) {
                num7 = num8;
            }
            Boolean bool9 = this.f44458o;
            Integer num9 = num7;
            Boolean bool10 = bool9 == null ? aVar.f44458o : bool9;
            Boolean bool11 = this.f44459p;
            Boolean bool12 = bool11 == null ? aVar.f44459p : bool11;
            Boolean bool13 = this.f44460q;
            return new a(str, str3, str5, str7, bool, location, bool3, num, num3, num5, bool5, bool7, map3, num9, bool10, bool12, bool13 == null ? aVar.f44460q : bool13);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(@androidx.annotation.NonNull com.yandex.metrica.CounterConfiguration r22, @androidx.annotation.Nullable java.util.Map<java.lang.String, java.lang.String> r23) {
            /*
                r21 = this;
                r1 = r22
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_DEVICE_SIZE_TYPE"
                java.lang.String r4 = r0.getAsString(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_APP_VERSION"
                java.lang.String r5 = r0.getAsString(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_APP_VERSION_CODE"
                java.lang.String r6 = r0.getAsString(r2)
                java.lang.String r7 = r22.m17753c()
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_LOCATION_TRACKING"
                java.lang.Boolean r8 = r0.getAsBoolean(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_MANUAL_LOCATION"
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L59
                android.content.ContentValues r0 = r1.f42234b
                byte[] r0 = r0.getAsByteArray(r2)
                int r2 = com.yandex.metrica.impl.p023ob.C3897dd.f44924q
                if (r0 == 0) goto L59
                android.os.Parcel r2 = android.os.Parcel.obtain()
                int r3 = r0.length     // Catch: java.lang.Throwable -> L56
                r9 = 0
                r2.unmarshall(r0, r9, r3)     // Catch: java.lang.Throwable -> L56
                r2.setDataPosition(r9)     // Catch: java.lang.Throwable -> L56
                java.lang.Class<android.location.Location> r0 = android.location.Location.class
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L56
                java.lang.Object r0 = r2.readValue(r0)     // Catch: java.lang.Throwable -> L56
                android.location.Location r0 = (android.location.Location) r0     // Catch: java.lang.Throwable -> L56
                r2.recycle()
                goto L5a
            L56:
                r2.recycle()
            L59:
                r0 = 0
            L5a:
                r9 = r0
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_IS_FIRST_ACTIVATION_AS_UPDATE"
                java.lang.Boolean r10 = r0.getAsBoolean(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_SESSION_TIMEOUT"
                java.lang.Integer r11 = r0.getAsInteger(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_MAX_REPORTS_COUNT"
                java.lang.Integer r12 = r0.getAsInteger(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_DISPATCH_PERIOD"
                java.lang.Integer r13 = r0.getAsInteger(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_IS_LOG_ENABLED"
                java.lang.Boolean r14 = r0.getAsBoolean(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_STATISTICS_SENDING"
                java.lang.Boolean r15 = r0.getAsBoolean(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "MAX_REPORTS_IN_DB_COUNT"
                java.lang.Integer r17 = r0.getAsInteger(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_NATIVE_CRASHES_ENABLED"
                java.lang.Boolean r18 = r0.getAsBoolean(r2)
                android.content.ContentValues r0 = r1.f42234b
                java.lang.String r2 = "CFG_LOCATION_ALLOWED_BY_BRIDGE"
                java.lang.Boolean r19 = r0.getAsBoolean(r2)
                monitor-enter(r22)
                android.content.ContentValues r0 = r1.f42234b     // Catch: java.lang.Throwable -> Lb5
                java.lang.String r2 = "CFG_REVENUE_AUTO_TRACKING_ENABLED"
                java.lang.Boolean r20 = r0.getAsBoolean(r2)     // Catch: java.lang.Throwable -> Lb5
                monitor-exit(r22)
                r3 = r21
                r16 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            Lb5:
                r0 = move-exception
                monitor-exit(r22)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3734X3.a.<init>(com.yandex.metrica.CounterConfiguration, java.util.Map):void");
        }

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        }
    }

    public C3734X3(@NonNull C3634T3 c3634t3) {
        this(new C4083kh.b(c3634t3), new a(c3634t3.m19136b(), c3634t3.m19135a().m19222a()), c3634t3.m19135a().m19229c());
    }

    public C3734X3(@NonNull C4083kh.b bVar, @NonNull a aVar, @Nullable ResultReceiver resultReceiver) {
        this.f44441a = bVar;
        this.f44442b = aVar;
        this.f44443c = resultReceiver;
    }
}
