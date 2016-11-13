package services;

import com.google.inject.AbstractModule;

/**
 * Created by jesusbueis1 on 13/11/16.
 */
public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class);
    }
}
