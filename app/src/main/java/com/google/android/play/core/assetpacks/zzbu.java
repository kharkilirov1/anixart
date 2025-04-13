package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.Tasks;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzbu {

    /* renamed from: a */
    public final com.google.android.play.core.internal.zzco<zzy> f19775a;

    public zzbu(com.google.android.play.core.internal.zzco<zzy> zzcoVar) {
        this.f19775a = zzcoVar;
    }

    /* renamed from: a */
    public final InputStream m10765a(int i2, String str, String str2, int i3) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) Tasks.m11005a(this.f19775a.mo10897u().mo10710b(i2, str, str2, i3));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new zzck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i2), str, str2, Integer.valueOf(i3)), i2);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e2) {
            throw new zzck("Extractor was interrupted while waiting for chunk file.", e2, i2);
        } catch (ExecutionException e3) {
            throw new zzck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i2), str, str2, Integer.valueOf(i3)), e3, i2);
        }
    }
}
