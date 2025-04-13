package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class ContentResolverCompat {

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static Cursor m1667a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    @Nullable
    /* renamed from: a */
    public static Cursor m1666a(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2, @Nullable androidx.core.os.CancellationSignal cancellationSignal) {
        Object m1946b;
        if (cancellationSignal != null) {
            try {
                m1946b = cancellationSignal.m1946b();
            } catch (Exception e2) {
                if (e2 instanceof OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e2;
            }
        } else {
            m1946b = null;
        }
        return Api16Impl.m1667a(contentResolver, null, null, null, null, null, (CancellationSignal) m1946b);
    }
}
