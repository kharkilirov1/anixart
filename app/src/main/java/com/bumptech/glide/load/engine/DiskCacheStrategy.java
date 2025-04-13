package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* loaded from: classes.dex */
public abstract class DiskCacheStrategy {

    /* renamed from: a */
    public static final DiskCacheStrategy f8203a = new DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.2
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: a */
        public boolean mo5021a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: b */
        public boolean mo5022b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: c */
        public boolean mo5023c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: d */
        public boolean mo5024d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    };

    /* renamed from: b */
    public static final DiskCacheStrategy f8204b = new DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.3
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: a */
        public boolean mo5021a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: b */
        public boolean mo5022b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: c */
        public boolean mo5023c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: d */
        public boolean mo5024d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    };

    /* renamed from: c */
    public static final DiskCacheStrategy f8205c = new DiskCacheStrategy() { // from class: com.bumptech.glide.load.engine.DiskCacheStrategy.5
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: a */
        public boolean mo5021a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: b */
        public boolean mo5022b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: c */
        public boolean mo5023c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: d */
        public boolean mo5024d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    };

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$1 */
    public class C07891 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: a */
        public boolean mo5021a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: b */
        public boolean mo5022b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: c */
        public boolean mo5023c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: d */
        public boolean mo5024d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DiskCacheStrategy$4 */
    public class C07924 extends DiskCacheStrategy {
        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: a */
        public boolean mo5021a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: b */
        public boolean mo5022b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: c */
        public boolean mo5023c(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.DiskCacheStrategy
        /* renamed from: d */
        public boolean mo5024d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: a */
    public abstract boolean mo5021a();

    /* renamed from: b */
    public abstract boolean mo5022b();

    /* renamed from: c */
    public abstract boolean mo5023c(DataSource dataSource);

    /* renamed from: d */
    public abstract boolean mo5024d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
