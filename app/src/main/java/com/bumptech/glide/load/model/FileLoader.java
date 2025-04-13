package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* renamed from: a */
    public final FileOpener<Data> f8430a;

    public static class Factory<Data> implements ModelLoaderFactory<File, Data> {

        /* renamed from: a */
        public final FileOpener<Data> f8431a;

        public Factory(FileOpener<Data> fileOpener) {
            this.f8431a = fileOpener;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        /* renamed from: b */
        public final ModelLoader<File, Data> mo5130b(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new FileLoader(this.f8431a);
        }
    }

    public static class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {
        public FileDescriptorFactory() {
            super(new FileOpener<ParcelFileDescriptor>() { // from class: com.bumptech.glide.load.model.FileLoader.FileDescriptorFactory.1
                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                /* renamed from: a */
                public Class<ParcelFileDescriptor> mo5136a() {
                    return ParcelFileDescriptor.class;
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                /* renamed from: b */
                public void mo5137b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                    parcelFileDescriptor.close();
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                /* renamed from: c */
                public ParcelFileDescriptor mo5138c(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }
            });
        }
    }

    public static final class FileFetcher<Data> implements DataFetcher<Data> {

        /* renamed from: b */
        public final File f8432b;

        /* renamed from: c */
        public final FileOpener<Data> f8433c;

        /* renamed from: d */
        public Data f8434d;

        public FileFetcher(File file, FileOpener<Data> fileOpener) {
            this.f8432b = file;
            this.f8433c = fileOpener;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: a */
        public Class<Data> mo4965a() {
            return this.f8433c.mo5136a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: b */
        public void mo4968b() {
            Data data = this.f8434d;
            if (data != null) {
                try {
                    this.f8433c.mo5137b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        @NonNull
        /* renamed from: d */
        public DataSource mo4970d() {
            return DataSource.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.DataFetcher
        /* renamed from: e */
        public void mo4971e(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super Data> dataCallback) {
            try {
                Data mo5138c = this.f8433c.mo5138c(this.f8432b);
                this.f8434d = mo5138c;
                dataCallback.mo4974f(mo5138c);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                dataCallback.mo4973c(e2);
            }
        }
    }

    public interface FileOpener<Data> {
        /* renamed from: a */
        Class<Data> mo5136a();

        /* renamed from: b */
        void mo5137b(Data data) throws IOException;

        /* renamed from: c */
        Data mo5138c(File file) throws FileNotFoundException;
    }

    public static class StreamFactory extends Factory<InputStream> {
        public StreamFactory() {
            super(new FileOpener<InputStream>() { // from class: com.bumptech.glide.load.model.FileLoader.StreamFactory.1
                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                /* renamed from: a */
                public Class<InputStream> mo5136a() {
                    return InputStream.class;
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                /* renamed from: b */
                public void mo5137b(InputStream inputStream) throws IOException {
                    inputStream.close();
                }

                @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
                /* renamed from: c */
                public InputStream mo5138c(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }

    public FileLoader(FileOpener<Data> fileOpener) {
        this.f8430a = fileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo5127a(@NonNull File file) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    /* renamed from: b */
    public ModelLoader.LoadData mo5128b(@NonNull File file, int i2, int i3, @NonNull Options options) {
        File file2 = file;
        return new ModelLoader.LoadData(new ObjectKey(file2), new FileFetcher(file2, this.f8430a));
    }
}
