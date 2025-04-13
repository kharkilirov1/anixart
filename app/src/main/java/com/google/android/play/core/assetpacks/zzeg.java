package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzeg {

    /* renamed from: c */
    public static final com.google.android.play.core.internal.zzag f20010c = new com.google.android.play.core.internal.zzag("PatchSliceTaskHandler");

    /* renamed from: a */
    public final zzbh f20011a;

    /* renamed from: b */
    public final com.google.android.play.core.internal.zzco<zzy> f20012b;

    public zzeg(zzbh zzbhVar, com.google.android.play.core.internal.zzco<zzy> zzcoVar) {
        this.f20011a = zzbhVar;
        this.f20012b = zzcoVar;
    }

    /* renamed from: a */
    public final void m10798a(zzef zzefVar) {
        File m10739p = this.f20011a.m10739p(zzefVar.f19921b, zzefVar.f20002c, zzefVar.f20003d);
        File file = new File(this.f20011a.m10740q(zzefVar.f19921b, zzefVar.f20002c, zzefVar.f20003d), zzefVar.f20007h);
        try {
            InputStream inputStream = zzefVar.f20009j;
            if (zzefVar.f20006g == 2) {
                inputStream = new GZIPInputStream(inputStream, RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST);
            }
            try {
                zzbk zzbkVar = new zzbk(m10739p, file);
                File m10744u = this.f20011a.m10744u(zzefVar.f19921b, zzefVar.f20004e, zzefVar.f20005f, zzefVar.f20007h);
                if (!m10744u.exists()) {
                    m10744u.mkdirs();
                }
                zzen zzenVar = new zzen(this.f20011a, zzefVar.f19921b, zzefVar.f20004e, zzefVar.f20005f, zzefVar.f20007h);
                com.google.android.play.core.internal.zzcl.m10893a(zzbkVar, inputStream, new zzcn(m10744u, zzenVar), zzefVar.f20008i);
                zzenVar.m10807h(0);
                inputStream.close();
                f20010c.m10837d("Patching and extraction finished for slice %s of pack %s.", zzefVar.f20007h, zzefVar.f19921b);
                this.f20012b.mo10897u().mo10711c(zzefVar.f19920a, zzefVar.f19921b, zzefVar.f20007h, 0);
                try {
                    zzefVar.f20009j.close();
                } catch (IOException unused) {
                    f20010c.m10838e("Could not close file for slice %s of pack %s.", zzefVar.f20007h, zzefVar.f19921b);
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
                throw th;
            }
        } catch (IOException e2) {
            f20010c.m10835b("IOException during patching %s.", e2.getMessage());
            throw new zzck(String.format("Error patching slice %s of pack %s.", zzefVar.f20007h, zzefVar.f19921b), e2, zzefVar.f19920a);
        }
    }
}
