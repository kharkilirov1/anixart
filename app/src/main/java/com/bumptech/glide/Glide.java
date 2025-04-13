package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.prefill.BitmapPreFiller;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ByteArrayLoader;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.ByteBufferFileLoader;
import com.bumptech.glide.load.model.DataUrlLoader;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ResourceLoader;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.model.StringLoader;
import com.bumptech.glide.load.model.UnitModelLoader;
import com.bumptech.glide.load.model.UriLoader;
import com.bumptech.glide.load.model.UrlUriLoader;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.model.stream.HttpUriLoader;
import com.bumptech.glide.load.model.stream.MediaStoreImageThumbLoader;
import com.bumptech.glide.load.model.stream.MediaStoreVideoThumbLoader;
import com.bumptech.glide.load.model.stream.UrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableDecoder;
import com.bumptech.glide.load.resource.bitmap.BitmapDrawableEncoder;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.ResourceBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.UnitBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.bytes.ByteBufferRewinder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.drawable.UnitDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableEncoder;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.BitmapBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.BitmapDrawableTranscoder;
import com.bumptech.glide.load.resource.transcode.DrawableBytesTranscoder;
import com.bumptech.glide.load.resource.transcode.GifDrawableBytesTranscoder;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.DefaultConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.module.ManifestParser;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000a.C0000a;

/* loaded from: classes.dex */
public class Glide implements ComponentCallbacks2 {

    /* renamed from: j */
    public static volatile Glide f7879j;

    /* renamed from: k */
    public static volatile boolean f7880k;

    /* renamed from: b */
    public final BitmapPool f7881b;

    /* renamed from: c */
    public final MemoryCache f7882c;

    /* renamed from: d */
    public final GlideContext f7883d;

    /* renamed from: e */
    public final Registry f7884e;

    /* renamed from: f */
    public final ArrayPool f7885f;

    /* renamed from: g */
    public final RequestManagerRetriever f7886g;

    /* renamed from: h */
    public final ConnectivityMonitorFactory f7887h;

    /* renamed from: i */
    public final List<RequestManager> f7888i = new ArrayList();

    public Glide(@NonNull Context context, @NonNull Engine engine, @NonNull MemoryCache memoryCache, @NonNull BitmapPool bitmapPool, @NonNull ArrayPool arrayPool, @NonNull RequestManagerRetriever requestManagerRetriever, @NonNull ConnectivityMonitorFactory connectivityMonitorFactory, int i2, @NonNull RequestOptions requestOptions, @NonNull Map<Class<?>, TransitionOptions<?, ?>> map, @NonNull List<RequestListener<Object>> list, boolean z) {
        this.f7881b = bitmapPool;
        this.f7885f = arrayPool;
        this.f7882c = memoryCache;
        this.f7886g = requestManagerRetriever;
        this.f7887h = connectivityMonitorFactory;
        new BitmapPreFiller(memoryCache, bitmapPool, (DecodeFormat) requestOptions.f8722r.m4960c(Downsampler.f8540f));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f7884e = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        ImageHeaderParserRegistry imageHeaderParserRegistry = registry.f7930g;
        synchronized (imageHeaderParserRegistry) {
            imageHeaderParserRegistry.f8691a.add(defaultImageHeaderParser);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            ExifInterfaceImageHeaderParser exifInterfaceImageHeaderParser = new ExifInterfaceImageHeaderParser();
            ImageHeaderParserRegistry imageHeaderParserRegistry2 = registry.f7930g;
            synchronized (imageHeaderParserRegistry2) {
                imageHeaderParserRegistry2.f8691a.add(exifInterfaceImageHeaderParser);
            }
        }
        List<ImageHeaderParser> m4879a = registry.m4879a();
        Downsampler downsampler = new Downsampler(m4879a, resources.getDisplayMetrics(), bitmapPool, arrayPool);
        ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(context, m4879a, bitmapPool, arrayPool);
        ResourceDecoder<ParcelFileDescriptor, Bitmap> m5194e = VideoDecoder.m5194e(bitmapPool);
        ByteBufferBitmapDecoder byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler);
        StreamBitmapDecoder streamBitmapDecoder = new StreamBitmapDecoder(downsampler, arrayPool);
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(context);
        ResourceLoader.StreamFactory streamFactory = new ResourceLoader.StreamFactory(resources);
        ResourceLoader.UriFactory uriFactory = new ResourceLoader.UriFactory(resources);
        ResourceLoader.FileDescriptorFactory fileDescriptorFactory = new ResourceLoader.FileDescriptorFactory(resources);
        ResourceLoader.AssetFileDescriptorFactory assetFileDescriptorFactory = new ResourceLoader.AssetFileDescriptorFactory(resources);
        BitmapEncoder bitmapEncoder = new BitmapEncoder(arrayPool);
        BitmapBytesTranscoder bitmapBytesTranscoder = new BitmapBytesTranscoder();
        GifDrawableBytesTranscoder gifDrawableBytesTranscoder = new GifDrawableBytesTranscoder();
        ContentResolver contentResolver = context.getContentResolver();
        registry.f7925b.m5243a(ByteBuffer.class, new ByteBufferEncoder());
        registry.f7925b.m5243a(InputStream.class, new StreamEncoder(arrayPool));
        registry.f7926c.m5245a("Bitmap", byteBufferBitmapDecoder, ByteBuffer.class, Bitmap.class);
        registry.f7926c.m5245a("Bitmap", streamBitmapDecoder, InputStream.class, Bitmap.class);
        registry.f7926c.m5245a("Bitmap", m5194e, ParcelFileDescriptor.class, Bitmap.class);
        registry.f7926c.m5245a("Bitmap", VideoDecoder.m5192c(bitmapPool), AssetFileDescriptor.class, Bitmap.class);
        UnitModelLoader.Factory<?> factory = UnitModelLoader.Factory.f8492a;
        registry.f7924a.m5149a(Bitmap.class, Bitmap.class, factory);
        registry.f7926c.m5245a("Bitmap", new UnitBitmapDecoder(), Bitmap.class, Bitmap.class);
        registry.f7927d.m5250a(Bitmap.class, bitmapEncoder);
        registry.f7926c.m5245a("BitmapDrawable", new BitmapDrawableDecoder(resources, byteBufferBitmapDecoder), ByteBuffer.class, BitmapDrawable.class);
        registry.f7926c.m5245a("BitmapDrawable", new BitmapDrawableDecoder(resources, streamBitmapDecoder), InputStream.class, BitmapDrawable.class);
        registry.f7926c.m5245a("BitmapDrawable", new BitmapDrawableDecoder(resources, m5194e), ParcelFileDescriptor.class, BitmapDrawable.class);
        registry.f7927d.m5250a(BitmapDrawable.class, new BitmapDrawableEncoder(bitmapPool, bitmapEncoder));
        registry.f7926c.m5245a("Gif", new StreamGifDecoder(m4879a, byteBufferGifDecoder, arrayPool), InputStream.class, GifDrawable.class);
        registry.f7926c.m5245a("Gif", byteBufferGifDecoder, ByteBuffer.class, GifDrawable.class);
        registry.f7927d.m5250a(GifDrawable.class, new GifDrawableEncoder());
        registry.f7924a.m5149a(GifDecoder.class, GifDecoder.class, factory);
        registry.f7926c.m5245a("Bitmap", new GifFrameResourceDecoder(bitmapPool), GifDecoder.class, Bitmap.class);
        registry.f7926c.m5245a("legacy_append", resourceDrawableDecoder, Uri.class, Drawable.class);
        registry.f7926c.m5245a("legacy_append", new ResourceBitmapDecoder(resourceDrawableDecoder, bitmapPool), Uri.class, Bitmap.class);
        registry.m4880b(new ByteBufferRewinder.Factory());
        registry.f7924a.m5149a(File.class, ByteBuffer.class, new ByteBufferFileLoader.Factory());
        registry.f7924a.m5149a(File.class, InputStream.class, new FileLoader.StreamFactory());
        registry.f7926c.m5245a("legacy_append", new FileDecoder(), File.class, File.class);
        registry.f7924a.m5149a(File.class, ParcelFileDescriptor.class, new FileLoader.FileDescriptorFactory());
        registry.f7924a.m5149a(File.class, File.class, factory);
        registry.m4880b(new InputStreamRewinder.Factory(arrayPool));
        Class cls = Integer.TYPE;
        registry.f7924a.m5149a(cls, InputStream.class, streamFactory);
        registry.f7924a.m5149a(cls, ParcelFileDescriptor.class, fileDescriptorFactory);
        registry.f7924a.m5149a(Integer.class, InputStream.class, streamFactory);
        registry.f7924a.m5149a(Integer.class, ParcelFileDescriptor.class, fileDescriptorFactory);
        registry.f7924a.m5149a(Integer.class, Uri.class, uriFactory);
        registry.f7924a.m5149a(cls, AssetFileDescriptor.class, assetFileDescriptorFactory);
        registry.f7924a.m5149a(Integer.class, AssetFileDescriptor.class, assetFileDescriptorFactory);
        registry.f7924a.m5149a(cls, Uri.class, uriFactory);
        registry.f7924a.m5149a(String.class, InputStream.class, new DataUrlLoader.StreamFactory());
        registry.f7924a.m5149a(Uri.class, InputStream.class, new DataUrlLoader.StreamFactory());
        registry.f7924a.m5149a(String.class, InputStream.class, new StringLoader.StreamFactory());
        registry.f7924a.m5149a(String.class, ParcelFileDescriptor.class, new StringLoader.FileDescriptorFactory());
        registry.f7924a.m5149a(String.class, AssetFileDescriptor.class, new StringLoader.AssetFileDescriptorFactory());
        registry.f7924a.m5149a(Uri.class, InputStream.class, new HttpUriLoader.Factory());
        registry.f7924a.m5149a(Uri.class, InputStream.class, new AssetUriLoader.StreamFactory(context.getAssets()));
        registry.f7924a.m5149a(Uri.class, ParcelFileDescriptor.class, new AssetUriLoader.FileDescriptorFactory(context.getAssets()));
        registry.f7924a.m5149a(Uri.class, InputStream.class, new MediaStoreImageThumbLoader.Factory(context));
        registry.f7924a.m5149a(Uri.class, InputStream.class, new MediaStoreVideoThumbLoader.Factory(context));
        registry.f7924a.m5149a(Uri.class, InputStream.class, new UriLoader.StreamFactory(contentResolver));
        registry.f7924a.m5149a(Uri.class, ParcelFileDescriptor.class, new UriLoader.FileDescriptorFactory(contentResolver));
        registry.f7924a.m5149a(Uri.class, AssetFileDescriptor.class, new UriLoader.AssetFileDescriptorFactory(contentResolver));
        registry.f7924a.m5149a(Uri.class, InputStream.class, new UrlUriLoader.StreamFactory());
        registry.f7924a.m5149a(URL.class, InputStream.class, new UrlLoader.StreamFactory());
        registry.f7924a.m5149a(Uri.class, File.class, new MediaStoreFileLoader.Factory(context));
        registry.f7924a.m5149a(GlideUrl.class, InputStream.class, new HttpGlideUrlLoader.Factory());
        registry.f7924a.m5149a(byte[].class, ByteBuffer.class, new ByteArrayLoader.ByteBufferFactory());
        registry.f7924a.m5149a(byte[].class, InputStream.class, new ByteArrayLoader.StreamFactory());
        registry.f7924a.m5149a(Uri.class, Uri.class, factory);
        registry.f7924a.m5149a(Drawable.class, Drawable.class, factory);
        registry.f7926c.m5245a("legacy_append", new UnitDrawableDecoder(), Drawable.class, Drawable.class);
        registry.f7929f.m5215c(Bitmap.class, BitmapDrawable.class, new BitmapDrawableTranscoder(resources));
        registry.f7929f.m5215c(Bitmap.class, byte[].class, bitmapBytesTranscoder);
        registry.f7929f.m5215c(Drawable.class, byte[].class, new DrawableBytesTranscoder(bitmapPool, bitmapBytesTranscoder, gifDrawableBytesTranscoder));
        registry.f7929f.m5215c(GifDrawable.class, byte[].class, gifDrawableBytesTranscoder);
        this.f7883d = new GlideContext(context, arrayPool, registry, new ImageViewTargetFactory(), requestOptions, map, list, engine, z, i2);
    }

    /* renamed from: a */
    public static void m4870a(@NonNull Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        List<GlideModule> list;
        if (f7880k) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f7880k = true;
        GlideBuilder glideBuilder = new GlideBuilder();
        Context applicationContext = context.getApplicationContext();
        try {
            generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            generatedAppGlideModule = null;
        } catch (IllegalAccessException e2) {
            m4873d(e2);
            throw null;
        } catch (InstantiationException e3) {
            m4873d(e3);
            throw null;
        } catch (NoSuchMethodException e4) {
            m4873d(e4);
            throw null;
        } catch (InvocationTargetException e5) {
            m4873d(e5);
            throw null;
        }
        List emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo4868c()) {
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData != null) {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(ManifestParser.m5241a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                } else if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                list = arrayList;
            } catch (PackageManager.NameNotFoundException e6) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e6);
            }
        } else {
            list = emptyList;
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo4864d().isEmpty()) {
            Set<Class<?>> mo4864d = generatedAppGlideModule.mo4864d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                GlideModule glideModule = (GlideModule) it.next();
                if (mo4864d.contains(glideModule.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + glideModule);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (GlideModule glideModule2 : list) {
                StringBuilder m24u = C0000a.m24u("Discovered GlideModule from manifest: ");
                m24u.append(glideModule2.getClass());
                Log.d("Glide", m24u.toString());
            }
        }
        glideBuilder.f7900l = generatedAppGlideModule != null ? generatedAppGlideModule.mo4865e() : null;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((GlideModule) it2.next()).m5239a(applicationContext, glideBuilder);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo4866a(applicationContext, glideBuilder);
        }
        if (glideBuilder.f7894f == null) {
            glideBuilder.f7894f = GlideExecutor.m5124d();
        }
        if (glideBuilder.f7895g == null) {
            glideBuilder.f7895g = GlideExecutor.m5123c();
        }
        if (glideBuilder.f7901m == null) {
            glideBuilder.f7901m = GlideExecutor.m5122b();
        }
        if (glideBuilder.f7897i == null) {
            glideBuilder.f7897i = new MemorySizeCalculator(new MemorySizeCalculator.Builder(applicationContext));
        }
        if (glideBuilder.f7898j == null) {
            glideBuilder.f7898j = new DefaultConnectivityMonitorFactory();
        }
        if (glideBuilder.f7891c == null) {
            int i2 = glideBuilder.f7897i.f8389a;
            if (i2 > 0) {
                glideBuilder.f7891c = new LruBitmapPool(i2);
            } else {
                glideBuilder.f7891c = new BitmapPoolAdapter();
            }
        }
        if (glideBuilder.f7892d == null) {
            glideBuilder.f7892d = new LruArrayPool(glideBuilder.f7897i.f8392d);
        }
        if (glideBuilder.f7893e == null) {
            glideBuilder.f7893e = new LruResourceCache(glideBuilder.f7897i.f8390b);
        }
        if (glideBuilder.f7896h == null) {
            glideBuilder.f7896h = new InternalCacheDiskCacheFactory(applicationContext);
        }
        if (glideBuilder.f7890b == null) {
            glideBuilder.f7890b = new Engine(glideBuilder.f7893e, glideBuilder.f7896h, glideBuilder.f7895g, glideBuilder.f7894f, GlideExecutor.m5125e(), GlideExecutor.m5122b(), false);
        }
        List<RequestListener<Object>> list2 = glideBuilder.f7902n;
        if (list2 == null) {
            glideBuilder.f7902n = Collections.emptyList();
        } else {
            glideBuilder.f7902n = Collections.unmodifiableList(list2);
        }
        GeneratedAppGlideModule generatedAppGlideModule2 = generatedAppGlideModule;
        Glide glide = new Glide(applicationContext, glideBuilder.f7890b, glideBuilder.f7893e, glideBuilder.f7891c, glideBuilder.f7892d, new RequestManagerRetriever(glideBuilder.f7900l), glideBuilder.f7898j, 4, glideBuilder.f7899k.mo5259i(), glideBuilder.f7889a, glideBuilder.f7902n, false);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((GlideModule) it3.next()).m5240b(applicationContext, glide, glide.f7884e);
        }
        if (generatedAppGlideModule2 != null) {
            generatedAppGlideModule2.mo4867b(applicationContext, glide, glide.f7884e);
        }
        applicationContext.registerComponentCallbacks(glide);
        f7879j = glide;
        f7880k = false;
    }

    @NonNull
    /* renamed from: b */
    public static Glide m4871b(@NonNull Context context) {
        if (f7879j == null) {
            synchronized (Glide.class) {
                if (f7879j == null) {
                    m4870a(context);
                }
            }
        }
        return f7879j;
    }

    @NonNull
    /* renamed from: c */
    public static RequestManagerRetriever m4872c(@Nullable Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m4871b(context).f7886g;
    }

    /* renamed from: d */
    public static void m4873d(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* renamed from: e */
    public static RequestManager m4874e(@NonNull Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m4871b(context).f7886g.m5231f(context);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        Util.m5344a();
        this.f7882c.mo5115b();
        this.f7881b.mo5077b();
        this.f7885f.mo5063b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        Util.m5344a();
        this.f7882c.mo5110a(i2);
        this.f7881b.mo5076a(i2);
        this.f7885f.mo5062a(i2);
    }
}
