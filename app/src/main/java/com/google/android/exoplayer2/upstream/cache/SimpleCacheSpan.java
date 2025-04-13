package com.google.android.exoplayer2.upstream.cache;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class SimpleCacheSpan extends CacheSpan {

    /* renamed from: g */
    public static final Pattern f14604g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: h */
    public static final Pattern f14605h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: i */
    public static final Pattern f14606i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan m7512a(java.io.File r7, long r8, long r10, com.google.android.exoplayer2.upstream.cache.CachedContentIndex r12) {
        /*
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = ".v3.exo"
            boolean r9 = r8.endsWith(r9)
            r10 = 1
            r11 = 0
            if (r9 != 0) goto Laa
            java.lang.String r8 = r7.getName()
            java.util.regex.Pattern r9 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.f14605h
            java.util.regex.Matcher r9 = r9.matcher(r8)
            boolean r0 = r9.matches()
            if (r0 == 0) goto L87
            java.lang.String r8 = r9.group(r10)
            java.util.Objects.requireNonNull(r8)
            int r9 = com.google.android.exoplayer2.util.Util.f14736a
            int r9 = r8.length()
            r0 = 0
            r1 = 0
            r2 = 0
        L2e:
            if (r1 >= r9) goto L3d
            char r3 = r8.charAt(r1)
            r4 = 37
            if (r3 != r4) goto L3a
            int r2 = r2 + 1
        L3a:
            int r1 = r1 + 1
            goto L2e
        L3d:
            if (r2 != 0) goto L40
            goto L9c
        L40:
            int r1 = r2 * 2
            int r1 = r9 - r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.util.regex.Pattern r4 = com.google.android.exoplayer2.util.Util.f14744i
            java.util.regex.Matcher r4 = r4.matcher(r8)
        L4f:
            if (r2 <= 0) goto L76
            boolean r5 = r4.find()
            if (r5 == 0) goto L76
            java.lang.String r5 = r4.group(r10)
            java.util.Objects.requireNonNull(r5)
            r6 = 16
            int r5 = java.lang.Integer.parseInt(r5, r6)
            char r5 = (char) r5
            int r6 = r4.start()
            r3.append(r8, r0, r6)
            r3.append(r5)
            int r0 = r4.end()
            int r2 = r2 + (-1)
            goto L4f
        L76:
            if (r0 >= r9) goto L7b
            r3.append(r8, r0, r9)
        L7b:
            int r8 = r3.length()
            if (r8 == r1) goto L82
            goto L9b
        L82:
            java.lang.String r8 = r3.toString()
            goto L9c
        L87:
            java.util.regex.Pattern r9 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.f14604g
            java.util.regex.Matcher r8 = r9.matcher(r8)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L9b
            java.lang.String r8 = r8.group(r10)
            java.util.Objects.requireNonNull(r8)
            goto L9c
        L9b:
            r8 = r11
        L9c:
            if (r8 != 0) goto L9f
            return r11
        L9f:
            java.io.File r7 = r7.getParentFile()
            com.google.android.exoplayer2.util.Assertions.m7518f(r7)
            java.util.Objects.requireNonNull(r12)
            throw r11
        Laa:
            java.util.regex.Pattern r7 = com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.f14606i
            java.util.regex.Matcher r7 = r7.matcher(r8)
            boolean r8 = r7.matches()
            if (r8 != 0) goto Lb7
            return r11
        Lb7:
            java.lang.String r7 = r7.group(r10)
            java.util.Objects.requireNonNull(r7)
            java.lang.Integer.parseInt(r7)
            java.util.Objects.requireNonNull(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan.m7512a(java.io.File, long, long, com.google.android.exoplayer2.upstream.cache.CachedContentIndex):com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan");
    }
}
