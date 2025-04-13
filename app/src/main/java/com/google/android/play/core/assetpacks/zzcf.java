package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzcf {

    /* renamed from: g */
    public static final com.google.android.play.core.internal.zzag f19827g = new com.google.android.play.core.internal.zzag("ExtractChunkTaskHandler");

    /* renamed from: a */
    public final byte[] f19828a = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];

    /* renamed from: b */
    public final zzbh f19829b;

    /* renamed from: c */
    public final com.google.android.play.core.internal.zzco<zzy> f19830c;

    /* renamed from: d */
    public final com.google.android.play.core.internal.zzco<zzbb> f19831d;

    /* renamed from: e */
    public final zzco f19832e;

    /* renamed from: f */
    public final zzeb f19833f;

    public zzcf(zzbh zzbhVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar, com.google.android.play.core.internal.zzco<zzbb> zzcoVar2, zzco zzcoVar3, zzeb zzebVar) {
        this.f19829b = zzbhVar;
        this.f19830c = zzcoVar;
        this.f19831d = zzcoVar2;
        this.f19832e = zzcoVar3;
        this.f19833f = zzebVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|(2:13|(12:15|(1:(1:(6:19|20|21|(2:22|(2:24|25)(1:106))|28|(1:30)(2:103|104))(2:114|115))(2:116|(10:118|(6:33|(4:34|(2:38|(1:47)(4:42|(1:44)|45|46))|48|(1:50)(1:75))|53|(1:55)|56|(2:58|(1:60)(2:61|(1:63)(3:64|(2:66|(1:68)(2:70|71))(1:73)|69))))|76|77|(2:97|98)|79|80|81|82|(4:84|353|89|90)(1:94))(2:119|120)))(2:121|(4:123|(4:124|(1:126)|127|(1:130)(1:138))|133|(3:135|136|137))(2:139|140))|31|(0)|76|77|(0)|79|80|81|82|(0)(0))(2:141|142))|143|(0)|76|77|(0)|79|80|81|82|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0324, code lost:
    
        com.google.android.play.core.assetpacks.zzcf.f19827g.m10838e("Could not close file for chunk %s of slice %s of pack %s.", java.lang.Integer.valueOf(r23.f19822h), r23.f19820f, r23.f19921b);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b6 A[Catch: all -> 0x02bc, TryCatch #5 {all -> 0x02bc, blocks: (B:33:0x01b6, B:34:0x01bf, B:36:0x01ca, B:38:0x01ce, B:40:0x01d4, B:42:0x01da, B:44:0x0200, B:46:0x020c, B:47:0x0210, B:48:0x0218, B:50:0x021c, B:53:0x0220, B:55:0x0224, B:56:0x0235, B:58:0x023b, B:60:0x0242, B:61:0x0255, B:63:0x0259, B:64:0x0268, B:66:0x026f, B:69:0x02af, B:70:0x0296, B:71:0x029d, B:73:0x029e, B:137:0x0180, B:139:0x0186, B:140:0x0190, B:141:0x0191, B:142:0x01b1), top: B:11:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0389 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.play.core.assetpacks.zzbh] */
    /* JADX WARN: Type inference failed for: r13v0, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.InputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10770a(com.google.android.play.core.assetpacks.zzce r23) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.zzcf.m10770a(com.google.android.play.core.assetpacks.zzce):void");
    }

    /* renamed from: b */
    public final File m10771b(zzce zzceVar) {
        File m10744u = this.f19829b.m10744u(zzceVar.f19921b, zzceVar.f19817c, zzceVar.f19818d, zzceVar.f19820f);
        if (!m10744u.exists()) {
            m10744u.mkdirs();
        }
        return m10744u;
    }
}
