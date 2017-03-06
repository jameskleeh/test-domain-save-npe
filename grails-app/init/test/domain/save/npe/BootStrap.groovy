package test.domain.save.npe

class BootStrap {

    def init = { servletContext ->
        Artist.withNewTransaction {
            def riverside = new Artist(name: 'Riverside')
            riverside.addToAlbums(title: 'Love, Fear and the Time Machine')
            riverside.addToAlbums(title: 'Anno Domini High Definition')
            riverside.save()
        }
    }
    def destroy = {
    }
}
