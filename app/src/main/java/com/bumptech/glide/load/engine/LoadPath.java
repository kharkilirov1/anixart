package com.bumptech.glide.load.engine;

import androidx.core.util.Pools;
import java.util.Arrays;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class LoadPath<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Pools.Pool<List<Throwable>> f8287a;

    /* renamed from: b */
    public final List<? extends DecodePath<Data, ResourceType, Transcode>> f8288b;

    /* renamed from: c */
    public final String f8289c;

    public LoadPath(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<DecodePath<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f8287a = pool;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f8288b = list;
        StringBuilder m24u = C0000a.m24u("Failed LoadPath{");
        m24u.append(cls.getSimpleName());
        m24u.append("->");
        m24u.append(cls2.getSimpleName());
        m24u.append("->");
        m24u.append(cls3.getSimpleName());
        m24u.append("}");
        this.f8289c = m24u.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[LOOP:0: B:2:0x000d->B:17:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[EDGE_INSN: B:18:0x0068->B:19:0x0068 BREAK  A[LOOP:0: B:2:0x000d->B:17:0x0065], SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bumptech.glide.load.engine.Resource<Transcode> m5055a(com.bumptech.glide.load.data.DataRewinder<Data> r15, @androidx.annotation.NonNull com.bumptech.glide.load.Options r16, int r17, int r18, com.bumptech.glide.load.engine.DecodePath.DecodeCallback<ResourceType> r19, java.util.List<java.lang.Throwable> r20) throws com.bumptech.glide.load.engine.GlideException {
        /*
            r14 = this;
            r1 = r14
            r2 = r20
            java.util.List<? extends com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> r0 = r1.f8288b
            int r3 = r0.size()
            r0 = 0
            r4 = 0
            r4 = r0
            r5 = 0
        Ld:
            if (r5 >= r3) goto L68
            java.util.List<? extends com.bumptech.glide.load.engine.DecodePath<Data, ResourceType, Transcode>> r0 = r1.f8288b
            java.lang.Object r0 = r0.get(r5)
            r12 = r0
            com.bumptech.glide.load.engine.DecodePath r12 = (com.bumptech.glide.load.engine.DecodePath) r12
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r12.f8201d     // Catch: com.bumptech.glide.load.engine.GlideException -> L4c
            java.lang.Object r0 = r0.mo2027b()     // Catch: com.bumptech.glide.load.engine.GlideException -> L4c
            java.lang.String r6 = "Argument must not be null"
            java.util.Objects.requireNonNull(r0, r6)     // Catch: com.bumptech.glide.load.engine.GlideException -> L4c
            r13 = r0
            java.util.List r13 = (java.util.List) r13     // Catch: com.bumptech.glide.load.engine.GlideException -> L4c
            r6 = r12
            r7 = r15
            r8 = r17
            r9 = r18
            r10 = r16
            r11 = r13
            com.bumptech.glide.load.engine.Resource r0 = r6.m5020a(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L52
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r6 = r12.f8201d     // Catch: com.bumptech.glide.load.engine.GlideException -> L4c
            r6.mo2026a(r13)     // Catch: com.bumptech.glide.load.engine.GlideException -> L4c
            r6 = r19
            com.bumptech.glide.load.engine.Resource r0 = r6.mo5017a(r0)     // Catch: com.bumptech.glide.load.engine.GlideException -> L48
            com.bumptech.glide.load.resource.transcode.ResourceTranscoder<ResourceType, Transcode> r7 = r12.f8200c     // Catch: com.bumptech.glide.load.engine.GlideException -> L48
            r8 = r16
            com.bumptech.glide.load.engine.Resource r0 = r7.mo5212a(r0, r8)     // Catch: com.bumptech.glide.load.engine.GlideException -> L5e
            r4 = r0
            goto L62
        L48:
            r0 = move-exception
            r8 = r16
            goto L5f
        L4c:
            r0 = move-exception
            r8 = r16
            r6 = r19
            goto L5f
        L52:
            r0 = move-exception
            r8 = r16
            r6 = r19
            r7 = r0
            androidx.core.util.Pools$Pool<java.util.List<java.lang.Throwable>> r0 = r12.f8201d     // Catch: com.bumptech.glide.load.engine.GlideException -> L5e
            r0.mo2026a(r13)     // Catch: com.bumptech.glide.load.engine.GlideException -> L5e
            throw r7     // Catch: com.bumptech.glide.load.engine.GlideException -> L5e
        L5e:
            r0 = move-exception
        L5f:
            r2.add(r0)
        L62:
            if (r4 == 0) goto L65
            goto L68
        L65:
            int r5 = r5 + 1
            goto Ld
        L68:
            if (r4 == 0) goto L6b
            return r4
        L6b:
            com.bumptech.glide.load.engine.GlideException r0 = new com.bumptech.glide.load.engine.GlideException
            java.lang.String r3 = r1.f8289c
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
            r0.<init>(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.LoadPath.m5055a(com.bumptech.glide.load.data.DataRewinder, com.bumptech.glide.load.Options, int, int, com.bumptech.glide.load.engine.DecodePath$DecodeCallback, java.util.List):com.bumptech.glide.load.engine.Resource");
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("LoadPath{decodePaths=");
        m24u.append(Arrays.toString(this.f8288b.toArray()));
        m24u.append('}');
        return m24u.toString();
    }
}
