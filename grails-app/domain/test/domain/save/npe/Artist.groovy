package test.domain.save.npe

class Artist {

    String name
    static hasMany = [albums: Album]

    static constraints = {
    }
}
