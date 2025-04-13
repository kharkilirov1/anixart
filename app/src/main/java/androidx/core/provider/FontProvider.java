package androidx.core.provider;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
class FontProvider {

    /* renamed from: a */
    public static final /* synthetic */ int f3472a = 0;

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static Cursor m1994a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[LOOP:1: B:13:0x004b->B:27:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[EDGE_INSN: B:28:0x0094->B:29:0x0094 BREAK  A[LOOP:1: B:13:0x004b->B:27:0x0090], SYNTHETIC] */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.provider.FontsContractCompat.FontFamilyResult m1993a(@androidx.annotation.NonNull android.content.Context r20, @androidx.annotation.NonNull androidx.core.provider.FontRequest r21, @androidx.annotation.Nullable android.os.CancellationSignal r22) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.FontProvider.m1993a(android.content.Context, androidx.core.provider.FontRequest, android.os.CancellationSignal):androidx.core.provider.FontsContractCompat$FontFamilyResult");
    }
}
