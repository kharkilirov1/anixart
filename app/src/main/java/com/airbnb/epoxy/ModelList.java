package com.airbnb.epoxy;

import androidx.annotation.NonNull;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
class ModelList extends ArrayList<EpoxyModel<?>> {

    /* renamed from: b */
    public boolean f7011b;

    /* renamed from: c */
    public ModelListObserver f7012c;

    public class Itr implements Iterator<EpoxyModel<?>> {

        /* renamed from: b */
        public int f7013b;

        /* renamed from: c */
        public int f7014c = -1;

        /* renamed from: d */
        public int f7015d;

        public Itr(C07171 c07171) {
            this.f7015d = ((ArrayList) ModelList.this).modCount;
        }

        /* renamed from: a */
        public final void m4619a() {
            if (((ArrayList) ModelList.this).modCount != this.f7015d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7013b != ModelList.this.size();
        }

        @Override // java.util.Iterator
        public EpoxyModel<?> next() {
            m4619a();
            int i2 = this.f7013b;
            this.f7013b = i2 + 1;
            this.f7014c = i2;
            return ModelList.this.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f7014c < 0) {
                throw new IllegalStateException();
            }
            m4619a();
            try {
                ModelList.this.remove(this.f7014c);
                this.f7013b = this.f7014c;
                this.f7014c = -1;
                this.f7015d = ((ArrayList) ModelList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public class ListItr extends Itr implements ListIterator<EpoxyModel<?>> {
        public ListItr(int i2) {
            super(null);
            this.f7013b = i2;
        }

        @Override // java.util.ListIterator
        public void add(EpoxyModel<?> epoxyModel) {
            EpoxyModel<?> epoxyModel2 = epoxyModel;
            m4619a();
            try {
                int i2 = this.f7013b;
                ModelList.this.add(i2, epoxyModel2);
                this.f7013b = i2 + 1;
                this.f7014c = -1;
                this.f7015d = ((ArrayList) ModelList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f7013b != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f7013b;
        }

        @Override // java.util.ListIterator
        public EpoxyModel<?> previous() {
            m4619a();
            int i2 = this.f7013b - 1;
            if (i2 < 0) {
                throw new NoSuchElementException();
            }
            this.f7013b = i2;
            this.f7014c = i2;
            return ModelList.this.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f7013b - 1;
        }

        @Override // java.util.ListIterator
        public void set(EpoxyModel<?> epoxyModel) {
            EpoxyModel<?> epoxyModel2 = epoxyModel;
            if (this.f7014c < 0) {
                throw new IllegalStateException();
            }
            m4619a();
            try {
                ModelList.this.set(this.f7014c, epoxyModel2);
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public interface ModelListObserver {
        /* renamed from: a */
        void mo4509a(int i2, int i3);

        /* renamed from: b */
        void mo4510b(int i2, int i3);
    }

    public ModelList(int i2) {
        super(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void add(int i2, EpoxyModel<?> epoxyModel) {
        ModelListObserver modelListObserver;
        if (!this.f7011b && (modelListObserver = this.f7012c) != null) {
            modelListObserver.mo4509a(i2, 1);
        }
        super.add(i2, epoxyModel);
    }

    /* renamed from: L */
    public boolean m4614L(EpoxyModel<?> epoxyModel) {
        m4615M(size(), 1);
        return super.add(epoxyModel);
    }

    /* renamed from: M */
    public final void m4615M(int i2, int i3) {
        ModelListObserver modelListObserver;
        if (this.f7011b || (modelListObserver = this.f7012c) == null) {
            return;
        }
        modelListObserver.mo4509a(i2, i3);
    }

    /* renamed from: O */
    public final void m4616O(int i2, int i3) {
        ModelListObserver modelListObserver;
        if (this.f7011b || (modelListObserver = this.f7012c) == null) {
            return;
        }
        modelListObserver.mo4510b(i2, i3);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<?> remove(int i2) {
        ModelListObserver modelListObserver;
        if (!this.f7011b && (modelListObserver = this.f7012c) != null) {
            modelListObserver.mo4510b(i2, 1);
        }
        return (EpoxyModel) super.remove(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public EpoxyModel<?> set(int i2, EpoxyModel<?> epoxyModel) {
        ModelListObserver modelListObserver;
        ModelListObserver modelListObserver2;
        EpoxyModel<?> epoxyModel2 = (EpoxyModel) super.set(i2, epoxyModel);
        if (epoxyModel2.f6925b != epoxyModel.f6925b) {
            if (!this.f7011b && (modelListObserver2 = this.f7012c) != null) {
                modelListObserver2.mo4510b(i2, 1);
            }
            if (!this.f7011b && (modelListObserver = this.f7012c) != null) {
                modelListObserver.mo4509a(i2, 1);
            }
        }
        return epoxyModel2;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends EpoxyModel<?>> collection) {
        m4615M(size(), collection.size());
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isEmpty()) {
            return;
        }
        m4616O(0, size());
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NonNull
    public Iterator<EpoxyModel<?>> iterator() {
        return new Itr(null);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    @NonNull
    public ListIterator<EpoxyModel<?>> listIterator() {
        return new ListItr(0);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<EpoxyModel<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i2, int i3) {
        ModelListObserver modelListObserver;
        if (i2 == i3) {
            return;
        }
        int i4 = i3 - i2;
        if (!this.f7011b && (modelListObserver = this.f7012c) != null) {
            modelListObserver.mo4510b(i2, i4);
        }
        super.removeRange(i2, i3);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<EpoxyModel<?>> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    @NonNull
    public List<EpoxyModel<?>> subList(int i2, int i3) {
        if (i2 < 0 || i3 > size()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 <= i3) {
            return new SubList(this, i2, i3);
        }
        throw new IllegalArgumentException();
    }

    public ModelList() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m4615M(size(), 1);
        return super.add((EpoxyModel) obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    @NonNull
    public ListIterator<EpoxyModel<?>> listIterator(int i2) {
        return new ListItr(i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        m4616O(indexOf, 1);
        super.remove(indexOf);
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends EpoxyModel<?>> collection) {
        ModelListObserver modelListObserver;
        int size = collection.size();
        if (!this.f7011b && (modelListObserver = this.f7012c) != null) {
            modelListObserver.mo4509a(i2, size);
        }
        return super.addAll(i2, collection);
    }

    public static class SubList extends AbstractList<EpoxyModel<?>> {

        /* renamed from: b */
        public final ModelList f7018b;

        /* renamed from: c */
        public int f7019c;

        /* renamed from: d */
        public int f7020d;

        public static final class SubListIterator implements ListIterator<EpoxyModel<?>> {

            /* renamed from: b */
            public final SubList f7021b;

            /* renamed from: c */
            public final ListIterator<EpoxyModel<?>> f7022c;

            /* renamed from: d */
            public int f7023d;

            /* renamed from: e */
            public int f7024e;

            public SubListIterator(ListIterator<EpoxyModel<?>> listIterator, SubList subList, int i2, int i3) {
                this.f7022c = listIterator;
                this.f7021b = subList;
                this.f7023d = i2;
                this.f7024e = i2 + i3;
            }

            @Override // java.util.ListIterator
            public void add(EpoxyModel<?> epoxyModel) {
                this.f7022c.add(epoxyModel);
                this.f7021b.m4620a(true);
                this.f7024e++;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f7022c.nextIndex() < this.f7024e;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f7022c.previousIndex() >= this.f7023d;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                if (this.f7022c.nextIndex() < this.f7024e) {
                    return this.f7022c.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f7022c.nextIndex() - this.f7023d;
            }

            @Override // java.util.ListIterator
            public EpoxyModel<?> previous() {
                if (this.f7022c.previousIndex() >= this.f7023d) {
                    return this.f7022c.previous();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                int previousIndex = this.f7022c.previousIndex();
                int i2 = this.f7023d;
                if (previousIndex >= i2) {
                    return previousIndex - i2;
                }
                return -1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.f7022c.remove();
                this.f7021b.m4620a(false);
                this.f7024e--;
            }

            @Override // java.util.ListIterator
            public void set(EpoxyModel<?> epoxyModel) {
                this.f7022c.set(epoxyModel);
            }
        }

        public SubList(ModelList modelList, int i2, int i3) {
            this.f7018b = modelList;
            ((AbstractList) this).modCount = ((ArrayList) modelList).modCount;
            this.f7019c = i2;
            this.f7020d = i3 - i2;
        }

        /* renamed from: a */
        public void m4620a(boolean z) {
            if (z) {
                this.f7020d++;
            } else {
                this.f7020d--;
            }
            ((AbstractList) this).modCount = ((ArrayList) this.f7018b).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, Object obj) {
            EpoxyModel<?> epoxyModel = (EpoxyModel) obj;
            if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 > this.f7020d) {
                throw new IndexOutOfBoundsException();
            }
            this.f7018b.add(i2 + this.f7019c, epoxyModel);
            this.f7020d++;
            ((AbstractList) this).modCount = ((ArrayList) this.f7018b).modCount;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i2, Collection<? extends EpoxyModel<?>> collection) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 > this.f7020d) {
                throw new IndexOutOfBoundsException();
            }
            boolean addAll = this.f7018b.addAll(i2 + this.f7019c, collection);
            if (addAll) {
                this.f7020d = collection.size() + this.f7020d;
                ((AbstractList) this).modCount = ((ArrayList) this.f7018b).modCount;
            }
            return addAll;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 >= this.f7020d) {
                throw new IndexOutOfBoundsException();
            }
            return this.f7018b.get(i2 + this.f7019c);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NonNull
        public Iterator<EpoxyModel<?>> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        @NonNull
        public ListIterator<EpoxyModel<?>> listIterator(int i2) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 > this.f7020d) {
                throw new IndexOutOfBoundsException();
            }
            return new SubListIterator(this.f7018b.listIterator(i2 + this.f7019c), this, this.f7019c, this.f7020d);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i2) {
            if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 >= this.f7020d) {
                throw new IndexOutOfBoundsException();
            }
            EpoxyModel<?> remove = this.f7018b.remove(i2 + this.f7019c);
            this.f7020d--;
            ((AbstractList) this).modCount = ((ArrayList) this.f7018b).modCount;
            return remove;
        }

        @Override // java.util.AbstractList
        public void removeRange(int i2, int i3) {
            if (i2 != i3) {
                if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                    throw new ConcurrentModificationException();
                }
                ModelList modelList = this.f7018b;
                int i4 = this.f7019c;
                modelList.removeRange(i2 + i4, i4 + i3);
                this.f7020d -= i3 - i2;
                ((AbstractList) this).modCount = ((ArrayList) this.f7018b).modCount;
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i2, Object obj) {
            EpoxyModel<?> epoxyModel = (EpoxyModel) obj;
            if (((AbstractList) this).modCount != ((ArrayList) this.f7018b).modCount) {
                throw new ConcurrentModificationException();
            }
            if (i2 < 0 || i2 >= this.f7020d) {
                throw new IndexOutOfBoundsException();
            }
            return this.f7018b.set(i2 + this.f7019c, epoxyModel);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7018b).modCount) {
                return this.f7020d;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NonNull Collection<? extends EpoxyModel<?>> collection) {
            if (((AbstractList) this).modCount == ((ArrayList) this.f7018b).modCount) {
                boolean addAll = this.f7018b.addAll(this.f7019c + this.f7020d, collection);
                if (addAll) {
                    this.f7020d = collection.size() + this.f7020d;
                    ((AbstractList) this).modCount = ((ArrayList) this.f7018b).modCount;
                }
                return addAll;
            }
            throw new ConcurrentModificationException();
        }
    }
}
