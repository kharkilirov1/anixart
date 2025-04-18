package androidx.core.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;

/* loaded from: classes.dex */
class DatagramSocketWrapper extends Socket {

    public static class DatagramSocketImplWrapper extends SocketImpl {
        @Override // java.net.SocketImpl
        public void accept(SocketImpl socketImpl) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public int available() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void bind(InetAddress inetAddress, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void close() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(String str, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void create(boolean z) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public InputStream getInputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public Object getOption(int i2) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public OutputStream getOutputStream() throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void listen(int i2) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void sendUrgentData(int i2) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketOptions
        public void setOption(int i2, Object obj) throws SocketException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(InetAddress inetAddress, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.net.SocketImpl
        public void connect(SocketAddress socketAddress, int i2) throws IOException {
            throw new UnsupportedOperationException();
        }
    }
}
