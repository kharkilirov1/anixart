package androidx.core.app;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ShareCompat {

    @RequiresApi
    public static class Api16Impl {
        @DoNotInline
        /* renamed from: a */
        public static String m1659a(CharSequence charSequence) {
            return Html.escapeHtml(charSequence);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m1660b(@NonNull Intent intent, @NonNull ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData(null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i2 = 1; i2 < size; i2++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i2)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m1661c(@NonNull Intent intent) {
            intent.setClipData(null);
            intent.setFlags(intent.getFlags() & (-2));
        }
    }

    public static class IntentBuilder {
    }

    public static class IntentReader {
    }
}
