package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
class DecodeJob<R> implements DataFetcherGenerator.FetcherReadyCallback, Runnable, Comparable<DecodeJob<?>>, FactoryPools.Poolable {

    /* renamed from: A */
    public Object f8145A;

    /* renamed from: B */
    public DataSource f8146B;

    /* renamed from: C */
    public DataFetcher<?> f8147C;

    /* renamed from: D */
    public volatile DataFetcherGenerator f8148D;

    /* renamed from: E */
    public volatile boolean f8149E;

    /* renamed from: F */
    public volatile boolean f8150F;

    /* renamed from: e */
    public final DiskCacheProvider f8154e;

    /* renamed from: f */
    public final Pools.Pool<DecodeJob<?>> f8155f;

    /* renamed from: i */
    public GlideContext f8158i;

    /* renamed from: j */
    public Key f8159j;

    /* renamed from: k */
    public Priority f8160k;

    /* renamed from: l */
    public EngineKey f8161l;

    /* renamed from: m */
    public int f8162m;

    /* renamed from: n */
    public int f8163n;

    /* renamed from: o */
    public DiskCacheStrategy f8164o;

    /* renamed from: p */
    public Options f8165p;

    /* renamed from: q */
    public Callback<R> f8166q;

    /* renamed from: r */
    public int f8167r;

    /* renamed from: s */
    public Stage f8168s;

    /* renamed from: t */
    public RunReason f8169t;

    /* renamed from: u */
    public long f8170u;

    /* renamed from: v */
    public boolean f8171v;

    /* renamed from: w */
    public Object f8172w;

    /* renamed from: x */
    public Thread f8173x;

    /* renamed from: y */
    public Key f8174y;

    /* renamed from: z */
    public Key f8175z;

    /* renamed from: b */
    public final DecodeHelper<R> f8151b = new DecodeHelper<>();

    /* renamed from: c */
    public final List<Throwable> f8152c = new ArrayList();

    /* renamed from: d */
    public final StateVerifier f8153d = StateVerifier.m5356a();

    /* renamed from: g */
    public final DeferredEncodeManager<?> f8156g = new DeferredEncodeManager<>();

    /* renamed from: h */
    public final ReleaseManager f8157h = new ReleaseManager();

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$1 */
    public static /* synthetic */ class C07881 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8176a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f8177b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f8178c;

        static {
            int[] iArr = new int[EncodeStrategy.values().length];
            f8178c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8178c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Stage.values().length];
            f8177b = iArr2;
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8177b[2] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8177b[3] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8177b[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8177b[0] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[RunReason.values().length];
            f8176a = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8176a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8176a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface Callback<R> {
        /* renamed from: a */
        void mo5014a(GlideException glideException);

        /* renamed from: b */
        void mo5015b(Resource<R> resource, DataSource dataSource);

        /* renamed from: c */
        void mo5016c(DecodeJob<?> decodeJob);
    }

    public final class DecodeCallback<Z> implements DecodePath.DecodeCallback<Z> {

        /* renamed from: a */
        public final DataSource f8179a;

        public DecodeCallback(DataSource dataSource) {
            this.f8179a = dataSource;
        }

        @Override // com.bumptech.glide.load.engine.DecodePath.DecodeCallback
        @NonNull
        /* renamed from: a */
        public Resource<Z> mo5017a(@NonNull Resource<Z> resource) {
            Resource<Z> resource2;
            Transformation<Z> transformation;
            EncodeStrategy encodeStrategy;
            Key dataCacheKey;
            DecodeJob decodeJob = DecodeJob.this;
            DataSource dataSource = this.f8179a;
            Objects.requireNonNull(decodeJob);
            Class<?> cls = resource.get().getClass();
            ResourceEncoder<Z> resourceEncoder = null;
            if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
                Transformation<Z> m5000f = decodeJob.f8151b.m5000f(cls);
                transformation = m5000f;
                resource2 = m5000f.mo4957b(decodeJob.f8158i, resource, decodeJob.f8162m, decodeJob.f8163n);
            } else {
                resource2 = resource;
                transformation = null;
            }
            if (!resource.equals(resource2)) {
                resource.mo5044c();
            }
            boolean z = false;
            if (decodeJob.f8151b.f8129c.f7905b.f7927d.m5251b(resource2.mo5046e()) != null) {
                resourceEncoder = decodeJob.f8151b.f8129c.f7905b.f7927d.m5251b(resource2.mo5046e());
                if (resourceEncoder == null) {
                    throw new Registry.NoResultEncoderAvailableException(resource2.mo5046e());
                }
                encodeStrategy = resourceEncoder.mo4964b(decodeJob.f8165p);
            } else {
                encodeStrategy = EncodeStrategy.NONE;
            }
            ResourceEncoder<Z> resourceEncoder2 = resourceEncoder;
            DecodeHelper<R> decodeHelper = decodeJob.f8151b;
            Key key = decodeJob.f8174y;
            List<ModelLoader.LoadData<?>> m4997c = decodeHelper.m4997c();
            int size = m4997c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (m4997c.get(i2).f8458a.equals(key)) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!decodeJob.f8164o.mo5024d(!z, dataSource, encodeStrategy)) {
                return resource2;
            }
            if (resourceEncoder2 == null) {
                throw new Registry.NoResultEncoderAvailableException(resource2.get().getClass());
            }
            int ordinal = encodeStrategy.ordinal();
            if (ordinal == 0) {
                dataCacheKey = new DataCacheKey(decodeJob.f8174y, decodeJob.f8159j);
            } else {
                if (ordinal != 1) {
                    throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy);
                }
                dataCacheKey = new ResourceCacheKey(decodeJob.f8151b.f8129c.f7904a, decodeJob.f8174y, decodeJob.f8159j, decodeJob.f8162m, decodeJob.f8163n, transformation, cls, decodeJob.f8165p);
            }
            LockedResource<Z> m5056a = LockedResource.m5056a(resource2);
            DeferredEncodeManager<?> deferredEncodeManager = decodeJob.f8156g;
            deferredEncodeManager.f8181a = dataCacheKey;
            deferredEncodeManager.f8182b = resourceEncoder2;
            deferredEncodeManager.f8183c = m5056a;
            return m5056a;
        }
    }

    public static class DeferredEncodeManager<Z> {

        /* renamed from: a */
        public Key f8181a;

        /* renamed from: b */
        public ResourceEncoder<Z> f8182b;

        /* renamed from: c */
        public LockedResource<Z> f8183c;
    }

    public interface DiskCacheProvider {
        /* renamed from: a */
        DiskCache mo5018a();
    }

    public static class ReleaseManager {

        /* renamed from: a */
        public boolean f8184a;

        /* renamed from: b */
        public boolean f8185b;

        /* renamed from: c */
        public boolean f8186c;

        /* renamed from: a */
        public final boolean m5019a(boolean z) {
            return (this.f8186c || z || this.f8185b) && this.f8184a;
        }
    }

    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public DecodeJob(DiskCacheProvider diskCacheProvider, Pools.Pool<DecodeJob<?>> pool) {
        this.f8154e = diskCacheProvider;
        this.f8155f = pool;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    /* renamed from: a */
    public void mo4992a(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        dataFetcher.mo4968b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        Class<?> mo4965a = dataFetcher.mo4965a();
        glideException.f8279c = key;
        glideException.f8280d = dataSource;
        glideException.f8281e = mo4965a;
        this.f8152c.add(glideException);
        if (Thread.currentThread() == this.f8173x) {
            m5011n();
        } else {
            this.f8169t = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f8166q.mo5016c(this);
        }
    }

    /* renamed from: b */
    public final <Data> Resource<R> m5002b(DataFetcher<?> dataFetcher, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            int i2 = LogTime.f8843b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Resource<R> m5003c = m5003c(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m5008k("Decoded result " + m5003c, elapsedRealtimeNanos, null);
            }
            return m5003c;
        } finally {
            dataFetcher.mo4968b();
        }
    }

    /* renamed from: c */
    public final <Data> Resource<R> m5003c(Data data, DataSource dataSource) throws GlideException {
        DataRewinder<Data> mo4978b;
        LoadPath<Data, ?, R> m4998d = this.f8151b.m4998d(data.getClass());
        Options options = this.f8165p;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f8151b.f8144r;
            Option<Boolean> option = Downsampler.f8542h;
            Boolean bool = (Boolean) options.m4960c(option);
            if (bool == null || (bool.booleanValue() && !z)) {
                options = new Options();
                options.m4961d(this.f8165p);
                options.f8062b.put(option, Boolean.valueOf(z));
            }
        }
        Options options2 = options;
        DataRewinderRegistry dataRewinderRegistry = this.f8158i.f7905b.f7928e;
        synchronized (dataRewinderRegistry) {
            DataRewinder.Factory<?> factory = dataRewinderRegistry.f8071a.get(data.getClass());
            if (factory == null) {
                Iterator<DataRewinder.Factory<?>> it = dataRewinderRegistry.f8071a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DataRewinder.Factory<?> next = it.next();
                    if (next.mo4977a().isAssignableFrom(data.getClass())) {
                        factory = next;
                        break;
                    }
                }
            }
            if (factory == null) {
                factory = DataRewinderRegistry.f8070b;
            }
            mo4978b = factory.mo4978b(data);
        }
        try {
            int i2 = this.f8162m;
            int i3 = this.f8163n;
            DecodeCallback decodeCallback = new DecodeCallback(dataSource);
            List<Throwable> mo2027b = m4998d.f8287a.mo2027b();
            Objects.requireNonNull(mo2027b, "Argument must not be null");
            List<Throwable> list = mo2027b;
            try {
                return m4998d.m5055a(mo4978b, options2, i2, i3, decodeCallback, list);
            } finally {
                m4998d.f8287a.mo2026a(list);
            }
        } finally {
            mo4978b.mo4976b();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int ordinal = this.f8160k.ordinal() - decodeJob2.f8160k.ordinal();
        return ordinal == 0 ? this.f8167r - decodeJob2.f8167r : ordinal;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    /* renamed from: d */
    public void mo4993d() {
        this.f8169t = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f8166q.mo5016c(this);
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback
    /* renamed from: e */
    public void mo4994e(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.f8174y = key;
        this.f8145A = obj;
        this.f8147C = dataFetcher;
        this.f8146B = dataSource;
        this.f8175z = key2;
        if (Thread.currentThread() == this.f8173x) {
            m5004f();
        } else {
            this.f8169t = RunReason.DECODE_DATA;
            this.f8166q.mo5016c(this);
        }
    }

    /* renamed from: f */
    public final void m5004f() {
        Resource<R> resource;
        boolean m5019a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.f8170u;
            StringBuilder m24u = C0000a.m24u("data: ");
            m24u.append(this.f8145A);
            m24u.append(", cache key: ");
            m24u.append(this.f8174y);
            m24u.append(", fetcher: ");
            m24u.append(this.f8147C);
            m5008k("Retrieved data", j2, m24u.toString());
        }
        LockedResource lockedResource = null;
        try {
            resource = m5002b(this.f8147C, this.f8145A, this.f8146B);
        } catch (GlideException e2) {
            Key key = this.f8175z;
            DataSource dataSource = this.f8146B;
            e2.f8279c = key;
            e2.f8280d = dataSource;
            e2.f8281e = null;
            this.f8152c.add(e2);
            resource = null;
        }
        if (resource == null) {
            m5011n();
            return;
        }
        DataSource dataSource2 = this.f8146B;
        if (resource instanceof Initializable) {
            ((Initializable) resource).mo5053a();
        }
        if (this.f8156g.f8183c != null) {
            lockedResource = LockedResource.m5056a(resource);
            resource = lockedResource;
        }
        m5013p();
        this.f8166q.mo5015b(resource, dataSource2);
        this.f8168s = Stage.ENCODE;
        try {
            DeferredEncodeManager<?> deferredEncodeManager = this.f8156g;
            if (deferredEncodeManager.f8183c != null) {
                try {
                    this.f8154e.mo5018a().mo5104a(deferredEncodeManager.f8181a, new DataCacheWriter(deferredEncodeManager.f8182b, deferredEncodeManager.f8183c, this.f8165p));
                    deferredEncodeManager.f8183c.m5057b();
                } catch (Throwable th) {
                    deferredEncodeManager.f8183c.m5057b();
                    throw th;
                }
            }
            ReleaseManager releaseManager = this.f8157h;
            synchronized (releaseManager) {
                releaseManager.f8185b = true;
                m5019a = releaseManager.m5019a(false);
            }
            if (m5019a) {
                m5010m();
            }
        } finally {
            if (lockedResource != null) {
                lockedResource.m5057b();
            }
        }
    }

    @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
    @NonNull
    /* renamed from: h */
    public StateVerifier mo5005h() {
        return this.f8153d;
    }

    /* renamed from: i */
    public final DataFetcherGenerator m5006i() {
        int ordinal = this.f8168s.ordinal();
        if (ordinal == 1) {
            return new ResourceCacheGenerator(this.f8151b, this);
        }
        if (ordinal == 2) {
            return new DataCacheGenerator(this.f8151b, this);
        }
        if (ordinal == 3) {
            return new SourceGenerator(this.f8151b, this);
        }
        if (ordinal == 5) {
            return null;
        }
        StringBuilder m24u = C0000a.m24u("Unrecognized stage: ");
        m24u.append(this.f8168s);
        throw new IllegalStateException(m24u.toString());
    }

    /* renamed from: j */
    public final Stage m5007j(Stage stage) {
        Stage stage2 = Stage.RESOURCE_CACHE;
        Stage stage3 = Stage.DATA_CACHE;
        Stage stage4 = Stage.FINISHED;
        int ordinal = stage.ordinal();
        if (ordinal == 0) {
            return this.f8164o.mo5022b() ? stage2 : m5007j(stage2);
        }
        if (ordinal == 1) {
            return this.f8164o.mo5021a() ? stage3 : m5007j(stage3);
        }
        if (ordinal == 2) {
            return this.f8171v ? stage4 : Stage.SOURCE;
        }
        if (ordinal == 3 || ordinal == 5) {
            return stage4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + stage);
    }

    /* renamed from: k */
    public final void m5008k(String str, long j2, String str2) {
        StringBuilder m27x = C0000a.m27x(str, " in ");
        m27x.append(LogTime.m5335a(j2));
        m27x.append(", load key: ");
        m27x.append(this.f8161l);
        m27x.append(str2 != null ? C0000a.m14k(", ", str2) : "");
        m27x.append(", thread: ");
        m27x.append(Thread.currentThread().getName());
        Log.v("DecodeJob", m27x.toString());
    }

    /* renamed from: l */
    public final void m5009l() {
        boolean m5019a;
        m5013p();
        this.f8166q.mo5014a(new GlideException("Failed to load resource", new ArrayList(this.f8152c)));
        ReleaseManager releaseManager = this.f8157h;
        synchronized (releaseManager) {
            releaseManager.f8186c = true;
            m5019a = releaseManager.m5019a(false);
        }
        if (m5019a) {
            m5010m();
        }
    }

    /* renamed from: m */
    public final void m5010m() {
        ReleaseManager releaseManager = this.f8157h;
        synchronized (releaseManager) {
            releaseManager.f8185b = false;
            releaseManager.f8184a = false;
            releaseManager.f8186c = false;
        }
        DeferredEncodeManager<?> deferredEncodeManager = this.f8156g;
        deferredEncodeManager.f8181a = null;
        deferredEncodeManager.f8182b = null;
        deferredEncodeManager.f8183c = null;
        DecodeHelper<R> decodeHelper = this.f8151b;
        decodeHelper.f8129c = null;
        decodeHelper.f8130d = null;
        decodeHelper.f8140n = null;
        decodeHelper.f8133g = null;
        decodeHelper.f8137k = null;
        decodeHelper.f8135i = null;
        decodeHelper.f8141o = null;
        decodeHelper.f8136j = null;
        decodeHelper.f8142p = null;
        decodeHelper.f8127a.clear();
        decodeHelper.f8138l = false;
        decodeHelper.f8128b.clear();
        decodeHelper.f8139m = false;
        this.f8149E = false;
        this.f8158i = null;
        this.f8159j = null;
        this.f8165p = null;
        this.f8160k = null;
        this.f8161l = null;
        this.f8166q = null;
        this.f8168s = null;
        this.f8148D = null;
        this.f8173x = null;
        this.f8174y = null;
        this.f8145A = null;
        this.f8146B = null;
        this.f8147C = null;
        this.f8170u = 0L;
        this.f8150F = false;
        this.f8172w = null;
        this.f8152c.clear();
        this.f8155f.mo2026a(this);
    }

    /* renamed from: n */
    public final void m5011n() {
        this.f8173x = Thread.currentThread();
        int i2 = LogTime.f8843b;
        this.f8170u = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.f8150F && this.f8148D != null && !(z = this.f8148D.mo4990b())) {
            this.f8168s = m5007j(this.f8168s);
            this.f8148D = m5006i();
            if (this.f8168s == Stage.SOURCE) {
                this.f8169t = RunReason.SWITCH_TO_SOURCE_SERVICE;
                this.f8166q.mo5016c(this);
                return;
            }
        }
        if ((this.f8168s == Stage.FINISHED || this.f8150F) && !z) {
            m5009l();
        }
    }

    /* renamed from: o */
    public final void m5012o() {
        int ordinal = this.f8169t.ordinal();
        if (ordinal == 0) {
            this.f8168s = m5007j(Stage.INITIALIZE);
            this.f8148D = m5006i();
            m5011n();
        } else if (ordinal == 1) {
            m5011n();
        } else if (ordinal == 2) {
            m5004f();
        } else {
            StringBuilder m24u = C0000a.m24u("Unrecognized run reason: ");
            m24u.append(this.f8169t);
            throw new IllegalStateException(m24u.toString());
        }
    }

    /* renamed from: p */
    public final void m5013p() {
        Throwable th;
        this.f8153d.mo5358c();
        if (!this.f8149E) {
            this.f8149E = true;
            return;
        }
        if (this.f8152c.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f8152c;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public void run() {
        DataFetcher<?> dataFetcher = this.f8147C;
        try {
            try {
                try {
                    if (this.f8150F) {
                        m5009l();
                        if (dataFetcher != null) {
                            dataFetcher.mo4968b();
                            return;
                        }
                        return;
                    }
                    m5012o();
                    if (dataFetcher != null) {
                        dataFetcher.mo4968b();
                    }
                } catch (CallbackException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f8150F + ", stage: " + this.f8168s, th);
                }
                if (this.f8168s != Stage.ENCODE) {
                    this.f8152c.add(th);
                    m5009l();
                }
                if (!this.f8150F) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dataFetcher != null) {
                dataFetcher.mo4968b();
            }
            throw th2;
        }
    }
}
