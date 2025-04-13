package com.stfalcon.imageviewer;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.stfalcon.imageviewer.loader.ImageLoader;
import com.stfalcon.imageviewer.viewer.builder.BuilderData;
import com.stfalcon.imageviewer.viewer.dialog.ImageViewerDialog;
import com.swiftsoft.anixartd.C2507R;
import java.util.List;

/* loaded from: classes2.dex */
public class StfalconImageViewer<T> {

    /* renamed from: a */
    public Context f25209a;

    /* renamed from: b */
    public BuilderData<T> f25210b;

    /* renamed from: c */
    public ImageViewerDialog<T> f25211c;

    public static class Builder<T> {

        /* renamed from: a */
        public Context f25212a;

        /* renamed from: b */
        public BuilderData<T> f25213b;

        public Builder(Context context, List<T> list, ImageLoader<T> imageLoader) {
            this.f25212a = context;
            this.f25213b = new BuilderData<>(list, imageLoader);
        }

        /* renamed from: a */
        public StfalconImageViewer<T> m14018a() {
            Context context = this.f25212a;
            BuilderData<T> builderData = this.f25213b;
            StfalconImageViewer<T> stfalconImageViewer = new StfalconImageViewer<>(context, builderData);
            if (builderData.f25273h.isEmpty()) {
                Log.w(stfalconImageViewer.f25209a.getString(C2507R.string.library_name), "Images list cannot be empty! Viewer ignored.");
            } else {
                ImageViewerDialog<T> imageViewerDialog = stfalconImageViewer.f25211c;
                imageViewerDialog.f25277c = true;
                imageViewerDialog.f25275a.show();
            }
            return stfalconImageViewer;
        }
    }

    public StfalconImageViewer(@NonNull Context context, @NonNull BuilderData<T> builderData) {
        this.f25209a = context;
        this.f25210b = builderData;
        this.f25211c = new ImageViewerDialog<>(context, builderData);
    }
}
