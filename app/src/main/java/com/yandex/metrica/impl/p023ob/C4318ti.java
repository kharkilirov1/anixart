package com.yandex.metrica.impl.p023ob;

import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.ti */
/* loaded from: classes2.dex */
public final class C4318ti {

    /* renamed from: a */
    private Map<String, ? extends List<String>> f46548a;

    /* renamed from: b */
    @NotNull
    private Map<String, ? extends C3963g1> f46549b;

    /* renamed from: c */
    @Nullable
    private C3963g1 f46550c;

    public C4318ti() {
        Map<String, ? extends List<String>> map;
        Map<String, ? extends C3963g1> map2;
        map = EmptyMap.f63145b;
        this.f46548a = map;
        map2 = EmptyMap.f63145b;
        this.f46549b = map2;
    }

    @Nullable
    /* renamed from: a */
    public final C3963g1 m20834a() {
        return this.f46550c;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, C3963g1> m20837b() {
        return this.f46549b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if ((r0 == null || r0.length() == 0) == false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000e, B:13:0x001a, B:15:0x001e, B:22:0x0027, B:26:0x005f, B:27:0x0074, B:29:0x007a, B:31:0x00a3, B:32:0x00ba, B:34:0x00c0, B:38:0x00e3, B:40:0x00e5, B:47:0x00e9, B:49:0x009f, B:50:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f A[Catch: all -> 0x00ed, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000e, B:13:0x001a, B:15:0x001e, B:22:0x0027, B:26:0x005f, B:27:0x0074, B:29:0x007a, B:31:0x00a3, B:32:0x00ba, B:34:0x00c0, B:38:0x00e3, B:40:0x00e5, B:47:0x00e9, B:49:0x009f, B:50:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000e, B:13:0x001a, B:15:0x001e, B:22:0x0027, B:26:0x005f, B:27:0x0074, B:29:0x007a, B:31:0x00a3, B:32:0x00ba, B:34:0x00c0, B:38:0x00e3, B:40:0x00e5, B:47:0x00e9, B:49:0x009f, B:50:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3 A[Catch: all -> 0x00ed, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000e, B:13:0x001a, B:15:0x001e, B:22:0x0027, B:26:0x005f, B:27:0x0074, B:29:0x007a, B:31:0x00a3, B:32:0x00ba, B:34:0x00c0, B:38:0x00e3, B:40:0x00e5, B:47:0x00e9, B:49:0x009f, B:50:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f A[Catch: all -> 0x00ed, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000e, B:13:0x001a, B:15:0x001e, B:22:0x0027, B:26:0x005f, B:27:0x0074, B:29:0x007a, B:31:0x00a3, B:32:0x00ba, B:34:0x00c0, B:38:0x00e3, B:40:0x00e5, B:47:0x00e9, B:49:0x009f, B:50:0x002f), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x002f A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x000e, B:13:0x001a, B:15:0x001e, B:22:0x0027, B:26:0x005f, B:27:0x0074, B:29:0x007a, B:31:0x00a3, B:32:0x00ba, B:34:0x00c0, B:38:0x00e3, B:40:0x00e5, B:47:0x00e9, B:49:0x009f, B:50:0x002f), top: B:2:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m20835a(@org.jetbrains.annotations.NotNull com.yandex.metrica.impl.p023ob.C3963g1 r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.yandex.metrica.impl.ob.g1 r0 = r8.f46550c     // Catch: java.lang.Throwable -> Led
            r1 = 0
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.f45155a     // Catch: java.lang.Throwable -> Led
            goto La
        L9:
            r0 = r1
        La:
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L17
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            if (r0 != 0) goto L27
            java.lang.String r0 = r9.f45155a     // Catch: java.lang.Throwable -> Led
            if (r0 == 0) goto L24
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L25
        L24:
            r2 = 1
        L25:
            if (r2 != 0) goto Leb
        L27:
            r8.f46550c = r9     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r9.f45155a     // Catch: java.lang.Throwable -> Led
            if (r0 != 0) goto L2f
            r2 = r1
            goto L5d
        L2f:
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> Led
            r2.<init>()     // Catch: java.lang.Throwable -> Led
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            java.util.Iterator r0 = r3.keys()     // Catch: java.lang.Throwable -> L5c
        L3d:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L5c
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r3.optString(r4)     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3d
            java.util.List r5 = com.yandex.metrica.impl.p023ob.C4452ym.m21255b(r5)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L3d
            r2.put(r4, r5)     // Catch: java.lang.Throwable -> L3d
            goto L3d
        L5c:
        L5d:
            if (r2 == 0) goto L9f
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Led
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Led
            int r3 = kotlin.collections.MapsKt.m32062g(r3)     // Catch: java.lang.Throwable -> Led
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Led
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> Led
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Led
        L74:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r3 == 0) goto La3
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Led
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Led
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> Led
            com.yandex.metrica.impl.ob.g1 r5 = new com.yandex.metrica.impl.ob.g1     // Catch: java.lang.Throwable -> Led
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Led
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> Led
            org.json.JSONArray r3 = com.yandex.metrica.impl.p023ob.C4452ym.m21257b(r3)     // Catch: java.lang.Throwable -> Led
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> Led
            com.yandex.metrica.impl.ob.e1 r6 = r9.f45156b     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r9.f45157c     // Catch: java.lang.Throwable -> Led
            r5.<init>(r3, r6, r7)     // Catch: java.lang.Throwable -> Led
            r0.put(r4, r5)     // Catch: java.lang.Throwable -> Led
            goto L74
        L9f:
            java.util.Map r0 = kotlin.collections.MapsKt.m32059d()     // Catch: java.lang.Throwable -> Led
        La3:
            r8.f46549b = r0     // Catch: java.lang.Throwable -> Led
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Led
            int r2 = r0.size()     // Catch: java.lang.Throwable -> Led
            int r2 = kotlin.collections.MapsKt.m32062g(r2)     // Catch: java.lang.Throwable -> Led
            r9.<init>(r2)     // Catch: java.lang.Throwable -> Led
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> Led
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Led
        Lba:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Led
            if (r2 == 0) goto Le9
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Led
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Led
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> Led
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Led
            com.yandex.metrica.impl.ob.g1 r2 = (com.yandex.metrica.impl.p023ob.C3963g1) r2     // Catch: java.lang.Throwable -> Led
            java.lang.String r2 = r2.f45155a     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Ld5
            goto Ldf
        Ld5:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ldf
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Ldf
            java.util.List r2 = com.yandex.metrica.impl.p023ob.C4452ym.m21255b(r4)     // Catch: java.lang.Throwable -> Ldf
            goto Le0
        Ldf:
            r2 = r1
        Le0:
            if (r2 == 0) goto Le3
            goto Le5
        Le3:
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.f63144b     // Catch: java.lang.Throwable -> Led
        Le5:
            r9.put(r3, r2)     // Catch: java.lang.Throwable -> Led
            goto Lba
        Le9:
            r8.f46548a = r9     // Catch: java.lang.Throwable -> Led
        Leb:
            monitor-exit(r8)
            return
        Led:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4318ti.m20835a(com.yandex.metrica.impl.ob.g1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x000a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m20836a(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, com.yandex.metrica.impl.p023ob.C3963g1> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L51
        La:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L30
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L51
            java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r2 = r4.f46548a     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L51
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L29
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = 0
            goto L2a
        L29:
            r3 = 1
        L2a:
            if (r3 != 0) goto La
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L51
            goto La
        L30:
            java.lang.String r5 = "yandex_mobile_metrica_custom_sdk_hosts"
            com.yandex.metrica.impl.ob.g1 r1 = new com.yandex.metrica.impl.ob.g1     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = com.yandex.metrica.impl.p023ob.C4452ym.m21253b(r0)     // Catch: java.lang.Throwable -> L51
            com.yandex.metrica.impl.ob.g1 r2 = r4.f46550c     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L41
            com.yandex.metrica.impl.ob.e1 r3 = r2.f45156b     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L41
            goto L43
        L41:
            com.yandex.metrica.impl.ob.e1 r3 = com.yandex.metrica.impl.p023ob.EnumC3911e1.UNKNOWN     // Catch: java.lang.Throwable -> L51
        L43:
            if (r2 == 0) goto L48
            java.lang.String r2 = r2.f45157c     // Catch: java.lang.Throwable -> L51
            goto L49
        L48:
            r2 = 0
        L49:
            r1.<init>(r0, r3, r2)     // Catch: java.lang.Throwable -> L51
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L51
            monitor-exit(r4)
            return
        L51:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4318ti.m20836a(java.util.List, java.util.Map):void");
    }
}
