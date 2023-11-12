mediafilesCREATE DATABASE MediaPlayerDB;
USE MediaPlayerDB;

CREATE TABLE MediaFiles (
    id INT AUTO_INCREMENT PRIMARY KEY,
    file_name VARCHAR(255),
    file_path VARCHAR(255)
);

INSERT INTO MediaFiles (file_name, file_path) VALUES
    ('Loneliness', 'C:\\Users\\HP\\Downloads\\Poylow-_-Mandrazo-Loneliness-_feat.-Barmuda_-_NCS-Release_.wav'),
    ('8 Rounds', 'C:\\Users\\HP\\Downloads\\Zaug-8-Rounds-_NCS-Release_.wav'),
    ('magenta RIDDIM', 'C:\\Users\\HP\\Downloads\\Poylow-_-Mandrazo-Loneliness-_feat.-Barmuda_-_NCS-Release_.wav'),
    ('Song 4', 'C:\\Users\\HP\\Downloads\\Zaug-8-Rounds-_NCS-Release_.wav'),
    ('Song 5', 'C:\\Users\\HP\\Documents\\Travis Scott - Apple Pie (Lyrics on screen)-YConverter.app.wav');
