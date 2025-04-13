package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
class CycleDetector {

    public static class ComponentNode {

        /* renamed from: a */
        public final Component<?> f22494a;

        /* renamed from: b */
        public final Set<ComponentNode> f22495b = new HashSet();

        /* renamed from: c */
        public final Set<ComponentNode> f22496c = new HashSet();

        public ComponentNode(Component<?> component) {
            this.f22494a = component;
        }

        /* renamed from: a */
        public boolean m12348a() {
            return this.f22496c.isEmpty();
        }
    }

    public static class Dep {

        /* renamed from: a */
        public final Class<?> f22497a;

        /* renamed from: b */
        public final boolean f22498b;

        public Dep(Class cls, boolean z, C20581 c20581) {
            this.f22497a = cls;
            this.f22498b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Dep)) {
                return false;
            }
            Dep dep = (Dep) obj;
            return dep.f22497a.equals(this.f22497a) && dep.f22498b == this.f22498b;
        }

        public int hashCode() {
            return ((this.f22497a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f22498b).hashCode();
        }
    }

    /* renamed from: a */
    public static void m12347a(List<Component<?>> list) {
        Set<ComponentNode> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<Component<?>> it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (ComponentNode componentNode : (Set) it2.next()) {
                        for (Dependency dependency : componentNode.f22494a.f22470b) {
                            if ((dependency.f22501c == 0) && (set = (Set) hashMap.get(new Dep(dependency.f22499a, dependency.m12349a(), null))) != null) {
                                for (ComponentNode componentNode2 : set) {
                                    componentNode.f22495b.add(componentNode2);
                                    componentNode2.f22496c.add(componentNode);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    ComponentNode componentNode3 = (ComponentNode) it4.next();
                    if (componentNode3.m12348a()) {
                        hashSet2.add(componentNode3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    ComponentNode componentNode4 = (ComponentNode) hashSet2.iterator().next();
                    hashSet2.remove(componentNode4);
                    i2++;
                    for (ComponentNode componentNode5 : componentNode4.f22495b) {
                        componentNode5.f22496c.remove(componentNode4);
                        if (componentNode5.m12348a()) {
                            hashSet2.add(componentNode5);
                        }
                    }
                }
                if (i2 == list.size()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    ComponentNode componentNode6 = (ComponentNode) it5.next();
                    if (!componentNode6.m12348a() && !componentNode6.f22495b.isEmpty()) {
                        arrayList.add(componentNode6.f22494a);
                    }
                }
                throw new DependencyCycleException(arrayList);
            }
            Component<?> next = it.next();
            ComponentNode componentNode7 = new ComponentNode(next);
            for (Class<? super Object> cls : next.f22469a) {
                boolean z = !next.m12332d();
                Dep dep = new Dep(cls, z, null);
                if (!hashMap.containsKey(dep)) {
                    hashMap.put(dep, new HashSet());
                }
                Set set2 = (Set) hashMap.get(dep);
                if (!set2.isEmpty() && !z) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(componentNode7);
            }
        }
    }
}
