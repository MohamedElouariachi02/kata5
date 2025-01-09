package ulpgc.software.Control.Adapters;

import ulpgc.software.Model.User;

public interface UserAdapter<T> {
    User adapt(T t);
}
