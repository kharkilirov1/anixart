package com.bumptech.glide.load.resource.file;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class FileDecoder implements ResourceDecoder<File, File> {
    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo4962a(@NonNull File file, @NonNull Options options) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    /* renamed from: b */
    public Resource<File> mo4963b(@NonNull File file, int i2, int i3, @NonNull Options options) throws IOException {
        return new FileResource(file);
    }
}
