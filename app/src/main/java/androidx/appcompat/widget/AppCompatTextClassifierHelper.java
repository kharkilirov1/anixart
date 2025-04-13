package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
final class AppCompatTextClassifierHelper {

    /* renamed from: a */
    @NonNull
    public TextView f1239a;

    /* renamed from: b */
    @Nullable
    public TextClassifier f1240b;

    @RequiresApi
    public static final class Api26Impl {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static TextClassifier m779a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(@NonNull TextView textView) {
        this.f1239a = textView;
    }
}
