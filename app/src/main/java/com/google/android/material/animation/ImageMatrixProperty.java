package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f17350a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.f17350a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public Matrix get(@NonNull ImageView imageView) {
        this.f17350a.set(imageView.getImageMatrix());
        return this.f17350a;
    }

    @Override // android.util.Property
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
