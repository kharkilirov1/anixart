package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.collection.LongSparseArray;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
class ViewHolderState extends LongSparseArray<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new Parcelable.Creator<ViewHolderState>() { // from class: com.airbnb.epoxy.ViewHolderState.1
        @Override // android.os.Parcelable.Creator
        public ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt, null);
            for (int i2 = 0; i2 < readInt; i2++) {
                viewHolderState.m1098m(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }

        @Override // android.os.Parcelable.Creator
        public ViewHolderState[] newArray(int i2) {
            return new ViewHolderState[i2];
        }
    };

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new Parcelable.ClassLoaderCreator<ViewState>() { // from class: com.airbnb.epoxy.ViewHolderState.ViewState.1
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new ViewState[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader), null);
            }
        };

        public ViewState() {
        }

        /* renamed from: a */
        public void m4624a(View view) {
            int id2 = view.getId();
            if (view.getId() == -1) {
                view.setId(C2507R.id.view_model_state_saving_id);
            }
            view.restoreHierarchyState(this);
            view.setId(id2);
        }

        /* renamed from: c */
        public void m4625c(View view) {
            int id2 = view.getId();
            if (view.getId() == -1) {
                view.setId(C2507R.id.view_model_state_saving_id);
            }
            view.saveHierarchyState(this);
            view.setId(id2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = keyAt(i3);
                parcelableArr[i3] = valueAt(i3);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public ViewState(int i2, int[] iArr, Parcelable[] parcelableArr, C07181 c07181) {
            super(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                put(iArr[i3], parcelableArr[i3]);
            }
        }
    }

    public ViewHolderState(int i2, C07181 c07181) {
        super(i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: q */
    public void m4623q(EpoxyViewHolder epoxyViewHolder) {
        epoxyViewHolder.m4576a();
        if (epoxyViewHolder.f6963a.mo4527q2()) {
            ViewState m1094h = m1094h(epoxyViewHolder.getItemId());
            if (m1094h == null) {
                m1094h = new ViewState();
            }
            m1094h.m4625c(epoxyViewHolder.itemView);
            m1098m(epoxyViewHolder.getItemId(), m1094h);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int m1100o = m1100o();
        parcel.writeInt(m1100o);
        for (int i3 = 0; i3 < m1100o; i3++) {
            parcel.writeLong(m1097l(i3));
            parcel.writeParcelable(m1101p(i3), 0);
        }
    }

    public ViewHolderState() {
        super(10);
    }
}
