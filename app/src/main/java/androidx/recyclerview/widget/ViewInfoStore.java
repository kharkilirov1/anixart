package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class ViewInfoStore {

    /* renamed from: a */
    @VisibleForTesting
    public final SimpleArrayMap<RecyclerView.ViewHolder, InfoRecord> f5714a = new SimpleArrayMap<>();

    /* renamed from: b */
    @VisibleForTesting
    public final LongSparseArray<RecyclerView.ViewHolder> f5715b = new LongSparseArray<>(10);

    public static class InfoRecord {

        /* renamed from: d */
        public static Pools.Pool<InfoRecord> f5716d = new Pools.SimplePool(20);

        /* renamed from: a */
        public int f5717a;

        /* renamed from: b */
        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo f5718b;

        /* renamed from: c */
        @Nullable
        public RecyclerView.ItemAnimator.ItemHolderInfo f5719c;

        /* renamed from: a */
        public static InfoRecord m4024a() {
            InfoRecord infoRecord = (InfoRecord) ((Pools.SimplePool) f5716d).mo2027b();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }

        /* renamed from: b */
        public static void m4025b(InfoRecord infoRecord) {
            infoRecord.f5717a = 0;
            infoRecord.f5718b = null;
            infoRecord.f5719c = null;
            ((Pools.SimplePool) f5716d).mo2026a(infoRecord);
        }
    }

    public interface ProcessCallback {
        /* renamed from: a */
        void mo3833a(RecyclerView.ViewHolder viewHolder);

        /* renamed from: b */
        void mo3834b(RecyclerView.ViewHolder viewHolder, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: c */
        void mo3835c(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @Nullable RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: d */
        void mo3836d(RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, @NonNull RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    /* renamed from: a */
    public void m4017a(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.f5714a.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.m4024a();
            this.f5714a.put(viewHolder, infoRecord);
        }
        infoRecord.f5717a |= 1;
    }

    /* renamed from: b */
    public void m4018b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.f5714a.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.m4024a();
            this.f5714a.put(viewHolder, infoRecord);
        }
        infoRecord.f5719c = itemHolderInfo;
        infoRecord.f5717a |= 8;
    }

    /* renamed from: c */
    public void m4019c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = this.f5714a.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.m4024a();
            this.f5714a.put(viewHolder, infoRecord);
        }
        infoRecord.f5718b = itemHolderInfo;
        infoRecord.f5717a |= 4;
    }

    /* renamed from: d */
    public boolean m4020d(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.f5714a.get(viewHolder);
        return (infoRecord == null || (infoRecord.f5717a & 1) == 0) ? false : true;
    }

    /* renamed from: e */
    public final RecyclerView.ItemAnimator.ItemHolderInfo m4021e(RecyclerView.ViewHolder viewHolder, int i2) {
        InfoRecord m1126m;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int m1119f = this.f5714a.m1119f(viewHolder);
        if (m1119f >= 0 && (m1126m = this.f5714a.m1126m(m1119f)) != null) {
            int i3 = m1126m.f5717a;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                m1126m.f5717a = i4;
                if (i2 == 4) {
                    itemHolderInfo = m1126m.f5718b;
                } else {
                    if (i2 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    itemHolderInfo = m1126m.f5719c;
                }
                if ((i4 & 12) == 0) {
                    this.f5714a.mo1124k(m1119f);
                    InfoRecord.m4025b(m1126m);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void m4022f(RecyclerView.ViewHolder viewHolder) {
        InfoRecord infoRecord = this.f5714a.get(viewHolder);
        if (infoRecord == null) {
            return;
        }
        infoRecord.f5717a &= -2;
    }

    /* renamed from: g */
    public void m4023g(RecyclerView.ViewHolder viewHolder) {
        int m1100o = this.f5715b.m1100o() - 1;
        while (true) {
            if (m1100o < 0) {
                break;
            }
            if (viewHolder == this.f5715b.m1101p(m1100o)) {
                LongSparseArray<RecyclerView.ViewHolder> longSparseArray = this.f5715b;
                Object[] objArr = longSparseArray.f1817d;
                Object obj = objArr[m1100o];
                Object obj2 = LongSparseArray.f1814f;
                if (obj != obj2) {
                    objArr[m1100o] = obj2;
                    longSparseArray.f1815b = true;
                }
            } else {
                m1100o--;
            }
        }
        InfoRecord remove = this.f5714a.remove(viewHolder);
        if (remove != null) {
            InfoRecord.m4025b(remove);
        }
    }
}
